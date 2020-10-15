### 运行hive：

```
hadoop@xiaoni-VirtualBox:~$ hive

hive> add jar /home/hadoop/wc.jar;
hive> show functions

hive> create temporary function mykeytovalue as 'com.qf.udf.KeyToValue';
hive> select mykeytovalue("sex=1&height=180&weight=128&sla=30000","sla");
```

### hive安装目录bin下vim .hiverc文件
/usr/local/hive/bin
add jar /home/hadoop/wc.jar;
create temporary function mykeytovalue as 'com.qf.udf.KeyToValue';
