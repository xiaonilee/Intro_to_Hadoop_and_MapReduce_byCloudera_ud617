##ZooKeeper:

##start
```
sudo /usr/local/zookeeper-3.6.1-bin/bin/zkServer.sh start
```
##connect:
```
zkCli.sh 
```

hadoop@xiaoni-VirtualBox:/usr/local/zookeeper-3.6.1-bin$ zkCli.sh
[zk: localhost:2181(CONNECTED) 0] ls /
[zookeeper]

[zk: localhost:2181(CONNECTED) 3] create /name 'zhangsan'

[zk: localhost:2181(CONNECTED) 6] get /name
zhangsan

[zk: localhost:2181(CONNECTED) 14] create /name
Node already exists: /name

[zk: localhost:2181(CONNECTED) 15] create -s /name
Created /name0000000004

[zk: localhost:2181(CONNECTED) 6] set /name 'xiaowang'
[zk: localhost:2181(CONNECTED) 8] get /name
xiaowang

[zk: localhost:2181(CONNECTED) 16] ls /
[name, name0000000004, zookeeper]

[zk: localhost:2181(CONNECTED) 17] delete /name
