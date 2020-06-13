#!/bin/bash

set -x
##go,dont exit set -e
##getopt set -u

## usage:
##      ./docker-utils.sh
##      -a install|upgrade|remove
##      <-c 1.18.0-rc1>
##      <-h amd64>
##      <-s 0:dont speed>|<-s 1:enable speed with default url>|<-s http://xxx.xxx.xx:enable speed with url>

default_arch='amd64'
default_compose_version='1.26.0'
default_docker_speed='http://e937f74d.m.daocloud.io'

compose_path=/usr/local/bin/docker-compose
docker_gpg_url=https://download.docker.com/linux/ubuntu/gpg
OS_DISTRIB_ID=$(cat /etc/*-release | awk -F '=' '$1=="DISTRIB_ID" {print $2}'|awk '{print tolower($0)}')

function  repository_setup(){
        arch=$1
        # SET UP THE REPOSITORY
        # 1 Update the apt package index:
        sudo apt-get update
        # 2 Install packages to allow apt to use a repository over HTTPS:
        sudo apt-get --yes install apt-transport-https ca-certificates curl software-properties-common
        # 3 Add Docker’s official GPG key:
        curl -fsSL ${docker_gpg_url} | sudo apt-key add -

        if [ "${arch}" == "amd64" ]
        then
                repository_setup_amd64
        fi
}

function repository_setup_amd64(){
        # 4 stable amd64
        sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
}

function dockerce_install() {
        # INSTALL DOCKER CE
        # 1 Update the apt package index.
        sudo apt-get update
        # 2 Install the latest version of Docker CE, or go to the next step to install a specific version
        sudo apt-get --yes install docker-ce
}
function dockerce_version(){
        # show docker-ce version
        apt-cache madison docker-ce
}

function dockerce_new_install(){
        arch=$1
        repository_setup ${arch}
        dockerce_install
        dockerce_version
}

function dockerce_upgrade(){
        arch=$1
        sudo apt-get update
        dockerce_new_install ${arch}
}
function dockerce_uninstall(){
        sudo apt-get --yes  remove docker-ce
}
function docker_compose_uninstall(){
        [ -f "${compose_path}" ] && sudo rm -rf ${compose_path}
}

function docker_compose_install(){
        ver=$1
        [ -f "${compose_path}" ] && sudo rm -rf ${compose_path}
        curl -L https://github.com/docker/compose/releases/download/${ver}/docker-compose-`uname -s`-`uname -m` > ${compose_path}
        chmod a+x ${compose_path}
}
function run(){
        _action=$1
        _compose_version=$2
        _arch=$3

        if [ "${_action}" == "install" ];then
                dockerce_new_install ${_arch}
                docker_compose_install ${_compose_version}
        elif [ "${_action}" == "upgrade" ];then
                dockerce_upgrade ${_arch}
                docker_compose_install ${_compose_version}
        elif [ "${_action}" == "remove" ];then
                dockerce_uninstall
                docker_compose_uninstall
                sudo apt autoremove
        fi

}
function setup_speed(){
        _url=$1
        regex='(https?)://[-A-Za-z0-9\+&@#/%?=~_|!:,.;]*[-A-Za-z0-9\+&@#/%=~_|]'
        if [[ $_url =~ $regex ]]
        then
                curl -sSL https://get.daocloud.io/daotools/set_mirror.sh | sh -s $_url
        else
                curl -sSL https://get.daocloud.io/daotools/set_mirror.sh | sh -s $default_docker_speed
        fi

}
######------------------------#########

ARG_ARCH=${default_arch}
ARG_COMPOSE_VERSION=${default_compose_version}
ARG_DOCKER_SPEED=0

O=`getopt -o a:c:h:s: --long action:,compose-version:,arch:,docker-speed -- "$@"` || exit 1
eval set -- "$O"

# extract options and their arguments into variables.
while true ; do
    case "$1" in
        -a|--action)
            case "$2" in
                "") shift 2 ;;
                *) ARG_ACTION=$2 ; shift 2 ;;
            esac ;;
        -c|--compose-version)
            case "$2" in
                "") shift 2 ;;
                *) ARG_COMPOSE_VERSION=$2 ; shift 2 ;;
            esac ;;
        -h|--arch)
            case "$2" in
                "") shift 2 ;;
                *) ARG_ARCH=$2 ; shift 2 ;;
            esac ;;
        -s|--docker-speed)
            case "$2" in
                "") shift 2 ;;
                *) ARG_DOCKER_SPEED=$2 ; shift 2 ;;
            esac ;;
        --) shift ; break ;;
        *) echo "Internal error!" ; exit 1 ;;
    esac
done

if [ "${OS_DISTRIB_ID}" == 'ubuntu' ]
then
        run $ARG_ACTION $ARG_COMPOSE_VERSION $ARG_ARCH
        if [ "$ARG_ACTION" != "remove" ]  && [ "$ARG_DOCKER_SPEED" != "0" ];then
                setup_speed $ARG_DOCKER_SPEED
        fi
fi

