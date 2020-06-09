    1 
   71  hadoop fs -ls /
   72  -ls /
   73  ls
   74  rm hadoop.md
   75  ls
   76  hdfs dfs -ls /
   77  hadooptmpdata dfs -ls /
   78  rm hadoop-3.1.3.tar.gz 
   79  ls
   80  hadoop fs -put purchases.txt
   81  hadoop fs -ls /
   82  hdfs dfs -ls /
   83  ls /tmd/
   84  ls /tmp/
   85  ssh localhost
   86  cd
   87  su xiaoni
   88  ls
   89  cd
   90  ll
   91  ls
   92  cd hadoop-3.2.1/
   93  ll
   94  cd share/
   95  ll
   96  cd ..
   97  cd etc/
   98  ll
   99  pwd
  100  cd ..
  101  ll
  102  cd bin/
  103  ll
  104  pwd
  105  cd ..
  106  ll
  107  cd share/
  108  ls
  109  cd hadoop/
  110  ls
  111  cd mapreduce/
  112  ls
  113  pwd
  114  cd ..
  115  ls
  116  cd ..
  117  ls
  118  cd input/
  119  pwd
  120  cd ..
  121  ls
  122  cd hadoop-3.2.1/
  123  ls
  124  cd share/
  125  ls
  126  cd hadoop/
  127  ls
  128  cd mapreduce/
  129  ls
  130  cd hadoop-mapreduce-examples-3.2.1.jar
  131  ll
  132  ls .bin
  133  ls
  134  cle
  135  clear
  136  cd
  137  ll
  138  cd hadoop-3.2.1/
  139  ll
  140  cd bin/
  141  ll
  142  cd ..
  143  ll
  144  cd ./etc/
  145  ll
  146  cd ./hadoop/
  147  ll
  148  cat ./core-site.xml 
  149  ll
  150  cd ..
  151  ll
  152  cd ..
  153  ll
  154  ll ./sbin/
  155  cd ..
  156  ll
  157  cd hadoop-3.2.1/
  158  ll
  159  cd ./share/
  160  ll
  161  cd hadoop/
  162  ll
  163  cd ..
  164  ll
  165  vim /etc/profile
  166  which hadoop
  167  hadoop version
  168  vim ./etc/hadoop/hadoop-env.sh
  169  ll
  170  mkdir /home/input
  171  pwd
  172  cd ..
  173  ll
  174  ls
  175  mkdir /home/input
  176  pwd
  177  mkdir ./input
  178  cp ./etc/hadoop/*.xml ./input
  179  cp /home/hadoop/hadoop-3.2.1/etc/hadoop/*.xml ./input
  180  ll
  181  l
  182  ls
  183  cd input/
  184  ls
  185  ll
  186  cd ..
  187  ll
  188  ls
  189  cd hadoop-3.2.1/
  190  ls
  191  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep ./input ./output 'dfs[a-z.]+'
  192  cat ./output/*
  193  ll
  194  ls
  195  cd ..
  196  ls
  197  cd input/
  198  ls
  199  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input ./output
  200  cd ..
  201  ls
  202  cd hadoop-3.2.1/
  203  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input ./output
  204  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input /home/hadoop/output
  205  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input/ /home/hadoop/output
  206  ll /home/hadoop/output/
  207  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input/ /home/hadoop/output/
  208  ll /home/hadoop/output/
  209  cd ..
  210  ls
  211  ls input/
  212  ls
  213  cd hadoop-3.2.1/
  214  ls
  215  ls share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar
  216  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar --help
  217  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep -h
  218  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep input output 'dfs[a-z.]+'
  219  netstat -nltp
  220  ll
  221  ls sbin/
  222  start-dfs.sh 
  223  start-yarn.sh
  224  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input/ /home/hadoop/output
  225  ls
  226  ls ../
  227  ls
  228  cd ..
  229  ls
  230  hadoop jar hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input/ /home/hadoop/output
  231  hadoop jar hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount input output 'dfs[a-z.]+'
  232  ls /usr/
  233  ls
  234  pwd
  235  ls
  236  hdfs dfs -mkdir input 
  237  cd hadoop-3.2.1/
  238  hdfs dfs -mkdir input 
  239  ls /home/hadoop/
  240  cd ..
  241  ls
  242  hdfs dfs -mkdir /input2 
  243  ls
  244  hdfs dfs -h
  245  ls
  246  hdfs dfs -cp input/* /input2/
  247  hdfs dfs  ls
  248  hdfs dfs  -ls
  249  hdfs dfs  -ls /
  250  hdfs dfs -cp ./input/* /input2/*
  251  hdfs dfs -cp /home/hadoop/input/* /input2/*
  252  hdfs dfs -cp /home/hadoop/input/* /input2/
  253  hdfs dfs -cp -h
  254  ls
  255  hadoop jar hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /home/hadoop/input/ /home/hadoop/output 'dfs[a-z.]+'
  256  ls
  257  pwd
  258  ls hdfs/
  259  hdfs dfs -ls
  260  hdfs dfs -ls /
  261  ls
  262  cd hadoop-3.2.1/
  263  ls
  264  cp ../input . -a
  265  ls
  266  hadoop jar hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input output 'dfs[a-z.]+'
  267  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input output 'dfs[a-z.]+'
  268  ll
  269  ls
  270  cd Desktop/
  271  ll
  272  cd
  273  su xiaoni
  274  cd
  275  ll
  276  cd hadoop-3.2.1/
  277  ll
  278  cd etc/
  279  ll
  280  cd hadoop/
  281  ll
  282  ls
  283  stop-dfs.sh
  284  stop-yarn.sh 
  285  ls
  286  vim core-site.xml
  287  vim hdfs-site.xml 
  288  vim core-site.xml
  289  ls /home/hadoop/hadooptmpdata
  290  ls
  291  vim mapred-site.xml 
  292  echo $HADOOP_MAPRED_HOME
  293  vim mapred-site.xml 
  294  vim yarn-site.xml 
  295  ls
  296  cd ../../
  297  ls
  298  ./sbin/start-dfs.sh 
  299  ./sbin/start-yarn.
  300  ./sbin/start-yarn.sh 
  301  netstat -nltp
  302  clear
  303  ls
  304  bin/hdfs dfs -ls /
  305  bin/hdfs dfs -ls /user/hadoop
  306  bin/hdfs dfs -ls /user/hadoop/input
  307  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output 'dfs[a-z.]+'
  308  bin/hdfs dfs -ls /user/hadoop/input
  309  ls
  310  pwd
  311  bin/hdfs dfs -ls /user/hadoop/input
  312  bin/hdfs dfs -ls /
  313  ls /
  314  bin/hdfs dfs -ls /
  315  ls etc/
  316  bin/hdfs dfs -ls /user/hadoop
  317  bin/hdfs dfs -rmdir /input2
  318  bin/hdfs dfs -rmdir /input2 -rf
  319  bin/hdfs dfs -rmdir /input2 -f
  320  bin/hdfs dfs -rmdir -h
  321  bin/hdfs dfs -rm -r -f /input2
  322  bin/hdfs dfs -ls /
  323  bin/hdfs dfs -ls /user
  324  bin/hdfs dfs -ls /user/hadoop
  325  bin/hdfs dfs -ls /user/hadoop/output
  326  echo $HADOOP_MAPRED_HOME
  327  vim ~/.bashrc 
  328  clear
  329  ls
  330  cd ..
  331  ls
  332  ls input/
  333  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar 
  334  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep ./input/ output 'dfs[a-z.]+'
  335  ls
  336  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep ./input/ ./output 'dfs[a-z.]+'
  337  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep ./input/ ./output2 'dfs[a-z.]+'
  338  ls
  339  stop-yarn.sh
  340  stop-dfs.sh 
  341  ls
  342  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /home/hadoop/input/ /home/hadoop/output 'dfs[a-z.]+'
  343  start-dfs.sh 
  344  ./hadoop-3.2.1/bin/hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /home/hadoop/input/ /home/hadoop/output 'dfs[a-z.]+'
  345  start-yarn.sh 
  346  ls
  347  ls hdfs/datanode/current/
  348  ls
  349  hadoop fs -ls /
  350  hadoop fs -ls /user/hadoop
  351  history 
  352  history > history0526.md
  352 
  
  
  355  ls
  356  ls /tmp
  357  cp -a ./history0526.md /tmp/
  358  su xiaoni
  359  cp -a history0526.md /home/xiaoni/Desktop/

