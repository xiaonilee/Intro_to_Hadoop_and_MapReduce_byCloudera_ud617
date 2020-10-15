       
  ### 下载并且解压缩 apache-hive-3.1.2-bin
```
  885  cd /home/xiaoni/Downloads/
  
  886  mv apache-hive-3.1.2-bin /usr/local/hive
  887  su
  888  cd

  890  ls /usr/local/hive/
  
  896  vim .bashrc
  
  899  source .bashrc
```
  
  ### hive里面的guava-19.0.jar比hadoop里面的guava-27.0-jre.jar低版本，
  
  ### 删除hive的19.0，复制hadoop里的27.0：
  
```
  926  cp -a hadoop-3.2.1/share/hadoop/common/lib/guava-27.0-jre.jar /usr/local/hive/lib/
```

  ### 进入root账户

```
  928  sudo su
```
  
  ### 删除hive的19.0
```
  932  rm /usr/local/hive/lib/guava-19.0.jar 
```
  
  ### 修改hive-site名
```
  958  mv /usr/local/hive/conf/hive-default.xml.template /usr/local/hive/conf/hive-site.xml
```
  
  ### 配置hive-site.xml文件
```
  964  vim /usr/local/hive/conf/hive-site.xml  
  
  972  sudo mysql
  
  975  netstat -nltp
  976  mysql -hlocalhost -uroot -p
  977  mysql  -uroot -p
  978  mysql -h127.0.0.1  -uroot -p
```
  
  ### 下载添加mysql驱动到/usr/local/hive/lib/目录
```
  981  cp -a mysql-connector-java-8.0.20.jar /usr/local/hive/lib/
  982  sudo chown hadoop mysql-connector-java-8.0.20.jar 
  
  984  sudo visudo 
```
  
  ### 将hadoop用户添加到sudo中
```
  986  sudo usermod -a -G sudo hadoop
  
  987  sudo chown hadoop mysql-connector-java-8.0.20.jar 
  988  exit
  
  993  sudo chown hadoop mysql-connector-java-8.0.20.jar 
```
  
  ### 将hadoop用户添加到用户中
```
  996  sudo chown hadoop:hadoop mysql-connector-java-8.0.20.jar 
  998  cp ./mysql-connector-java-8.0.20.jar /usr/local/hive/lib/
  999  sudo cp ./mysql-connector-java-8.0.20.jar /usr/local/hive/lib/
 
 1004  start-dfs.sh
 1005  start-yarn.sh
  
 1060  sudo apt install mariadb-client

 1062  mysql -uroot -p

 1064  mysql -h127.0.0.1 -uroot -p
 1066  mysql -h127.0.0.1 -uroot -p -P3306
```
 
 ### 初始化： 
```
 1071  /usr/local/hive/bin/schematool -dbType mysql -initSchema
 1072  hive
```
