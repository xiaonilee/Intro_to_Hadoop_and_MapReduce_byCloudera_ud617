 ### 新建文件夹docker-mariadb 
```
 1112  sudo mkdir docker-mariadb
```

``` 
 1113  sudo cp -a /home/xiaoni/mysql/docker-compose.yml ./docker-mariadb/
 1114  sudo cp -a /home/xiaoni/mysql/docker-utils.sh ./docker-mariadb/
 1115  ls
 1116  cd docker-mariadb/
``` 
 
 ### 空目录，提示作用
```
 1118  sudo mkdir -p mariadb/_var_lib_mysql

 1120  sudo touch mariadb/_var_lib_mysql/.gitkeep
```
