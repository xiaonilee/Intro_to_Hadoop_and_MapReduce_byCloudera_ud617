
  438  su hadoop
  446  start-dfs.sh
  447  start-yarn.sh 
  
  450  cd hadoop-3.2.1/

  456  hdfs dfs -ls /
  457  hdfs dfs -ls /user
  458  hdfs dfs -ls /user/hadoop
  459  hdfs dfs -ls /user/hadoop/input


  466  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output3 'dfs[a-z.]+'
 
  469  hdfs dfs -ls /
  470  hdfs dfs -ls /user/hadoop
  471  hdfs dfs -cat /user/hadoop/output3

