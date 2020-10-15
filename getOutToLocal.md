```
    1  ls
    2  sudo nano
    3  sudo nano .bashrc
    4  nano .bashrc
    5  ls /home/hdoop/hadoop-3.2.1
    6  pwd
    7  ls
    8  cd hadoop-3.2.1/
    9  pwd
   10  ls
   11  cd ..
   12  ls
   13  nano .bashrc 
   14  source .bashrc 
   15  env
   16  ls $HADOOP_HOME
   17  echo $HADOOP_HOME
   18  ls /usr/lib/jvm/java-8-openjdk-amd64
   19  nano $HADOOP_HOME/etc/hadoop/hadoop-env.sh
   20  nano $HADOOP_HOME/etc/hadoop/core-site.xml
   21  mkdir ~/hadooptmpdata
   22  mkdir -p ~/hdfs/namenode ~/hdfs/datanode
   23  ls
   24  ls hdfs
   25  nano $HADOOP_HOME/etc/hadoop/core-site.xml
   26  history 
   27  ls /home/hadoop/hadooptmpdata
   28  nano $HADOOP_HOME/etc/hadoop/core-site.xml
   29  ls
   30  nano \$HADOOP_HOME/etc/hadoop/hdfs-site.xml 
   31  nano $HADOOP_HOME/etc/hadoop/hdfs-site.xml 
   32  vim $HADOOP_HOME/etc/hadoop/hdfs-site.xml 
   33  apt install vim
   34  sudo apt install vim
   35  nano $HADOOP_HOME/etc/hadoop/hdfs-site.xml 
   36  ls
   37  ls hdfs/
   38  nano hadoop-3.2.1/etc/hadoop/mapred-site.xml 
   39  nano hadoop-3.2.1/etc/hadoop/yarn-site.xml 
   40  hdfs namenode -format
   41  start-dfs.sh 
   42  start-yarn.sh 
   43  jps 
   44  hadoop version
   45  ps
   46  ps -a
   47  netstat -nltp
   48  sudo apt install net-tools
   49  netstat -nltp
   50  history 
   51  history > hadoop.md
   52  ls
   53  pwd
   54  ls /home/
   55  ls
   56  ls /tmp/
   57  cp hadoop.md /tmp/
   58  hdfs dfs -mkdir /test
   59  hdfs dfs -mkdir /hadooponubuntu
   60  hdfs dfs -ls /
   61  hadoop fs -ls
   62  hadoop fs -ls /
   63  hadooptmpdata/
   64  hadooptmpdata/ -ls /
   65  hadooptmpdata -ls /
   66  hdfs dfs -ls /
   67  /hadooponbuntu -ls /
   68  hadooponbuntu -ls /
   69  hadoop fs -ls /
   70  hadooponubuntu fs -ls /
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
  353  ls
  354  ll
  355  ls
  356  ls /tmp
  357  cp -a ./history0526.md /tmp/
  358  history 
  359  cd 
  360  ls
  361  hadoop fs -ls /
  362  ls
  363  cd hadoop-3.2.1/
  364  ls
  365  hadoop fs -put etc/hadoop/*.xml /input2
  366  hadoop fs -ls /input2
  367  ls
  368  rm input -rf
  369  clear
  370  ls
  371  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep input output 'dfs[a-z.]+'
  372  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep input2 output 'dfs[a-z.]+'
  373  hadoop fs -ls /
  374  hadoop fs -ls /input2
  375  hadoop fs -ls /user/hadoop
  376  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /input2 /output 'dfs[a-z.]+'
  377  hadoop fs -mkdir /output
  378  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /input2 /output 'dfs[a-z.]+'
  379  hadoop fs -h
  380  hadoop fs -rmdir /output
  381  hadoop fs ls /
  382  hadoop fs -ls /
  383  hadoop fs -ls /input2
  384  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /input2 /output 'dfs[a-z.]+'
  385  hadoop fs -ls /user/hadoop
  386  hadoop fs -mkdir /user/hadoop -p
  387  hadoop fs -mkdir /user
  388  hadoop fs -mkdir /user/hadoop
  389  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /input2 output 'dfs[a-z.]+'
  390  clear
  391  ls
  392  cd ..
  393  ls
  394  ls input/
  395  hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input/ output 'dfs[a-z.]+'
  396  hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount ./input/ output 'dfs[a-z.]+'
  397  ls
  398  hadoop fs ls /user/
  399  hadoop fs -ls /user/
  400  hadoop fs -ls /user/hadoop
  401  hadoop fs -ls /
  402  hadoop fs -mkdir input
  403  hadoop fs -ls /
  404  hadoop fs -ls /user/hadoop
  405  ls
  406  cd hadoop
  407  cd hadoop-3.2.1/
  408  ls
  409  bin/hdfs dfs -put etc/hadoop/*.xml input
  410  ls
  411  hadoop fs -ls /user/hadoop
  412  hadoop fs -ls /user/hadoop/input
  413  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep input output 'dfs[a-z.]+'
  414  bin/hdfs dfs -get output output
  415  hadoop fs -ls /user/hadoop/
  416  netstat -nltp
  417  clear
  418  ls
  419  cd ..
  420  ls
  421  hadoop jar ./hadoop-3.2.1/share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /home/hadoop/input output 'dfs[a-z.]+'
  422  ls
  423  cd hadoop-3.2.1/
  424  ls
  425  hadoop jar ./share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /user/hadoop/input /user/hadoop/output 'dfs[a-z.]+'
  426  bin/hadoop jar ./share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /user/hadoop/input /user/hadoop/output
  427  hadoop fs -ls /
  428  hadoop fs -ls /user/hadoop
  429  hadoop fs -ls /user
  430  hadoop fs -ls /
  431  ls
  432  ls ../
  433  bin/hadoop jar ./share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount -h
  434  bin/hadoop jar ./share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /input2/ /output/
  435  clear
  436  c d
  437  cd
  438  su xiaoni
  439  cd
  440  ls
  441  ls /input
  442  cd input/
  443  ll
  444  cd ..
  445  sbin/start-dfs.sh
  446  start-dfs.sh
  447  start-yarn.sh 
  448  bin/hdfs dfs -ls /
  449  cd hadoop
  450  cd hadoop-3.2.1/
  451  ll
  452  cle
  453  clear
  454  hdfs dfs -mkdir input
  455  ls
  456  hdfs dfs  -ls /
  457  hdfs dfs -ls /user
  458  hdfs dfs -ls /user/hadoop
  459  hdfs dfs -ls /user/hadoop/input
  460  hdfs dfs -ls /user/hadoop/output
  461  hdfs dfs -ls /user/hadoop/output2
  462  cat output/*
  463  hdfs dfs -cat output/*
  464  hdfs dfs -cat output/part-r-00000
  465  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output 'dfs[a-z.]+'
  466  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output3 'dfs[a-z.]+'
  467  history 
  468  hdfs dfs -ls /
  469  hdfs dfs  -ls /
  470  hdfs dfs -ls /user/hadoop
  471  hdfs dfs -cat /user/hadoop/output3/part-r-00000
  472  hdfs dfs -cat /user/hadoop/output3/part-r-00000/dfs.data.dir
  473  history > hadoopExample.md
  474  ls
  475  cp -a hadoopExample.md /tmp/
  476  cd ..
  477  ls /tmp/
  478  clear
  479  ls
  480  cd
  481  ls
  482  cd hadoop-3.2.1/
  483  ls
  484  cat etc/hadoop/core-site.xml 
  485  cd etc
  486  ls
  487  cd hadoop/
  488  ls
  489  cat hdfs-site.xml 
  490  cat yarn-site.xml 
  491  cat mapred-site.xml 
  492  clear
  493  cd
  494  stop-yarn.sh
  495  stop-dfs.sh
  496  start-dfs.sh
  497  start-yarn.sh
  498  jps
  499  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output4 'dfs[a-z.]+'
  500  cd
  501  ls
  502  cd hadoop-3.2.1/
  503  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar grep /user/hadoop/input /user/hadoop/output4 'dfs[a-z.]+'
  504  hdfs dfs -ls /
  505  hdfs dfs -ls /usr/
  506  hdfs dfs -ls /user/
  507  hdfs dfs -ls /user/hadoop
  508  hdfs dfs -ls /user/hadoop/output
  509  hdfs dfs -cat /user/hadoop/output/part-r-00000
  510  bin/hadoop jar share/hadoop/mapreduce/hadoop-mapreduce-examples-3.2.1.jar wordcount /user/hadoop/input /user/hadoop/output5
  511  hdfs dfs -cat /user/hadoop/output5/part-r-00000
  512  stop-yarn.sh
  513  stop-dfs.sh
  514  cd
  515  ll ~/.ssh/
  516  cle
  517  clear
  518  hdfs dfs -
  519  clear
  520  hdfs dfs -ls /
  521  start-dfs.sh
  522  start-yarn.sh
  523  hdfs dfs -ls /
  524  hadoop dfs -ls /
  525  hdfs dfs -lsR /
  526  hdfs dfs -lsr /
  527  hdfs dfs -ls -R /
  528  clear
  529  hdfs dfs -mkdir /test
  530  hdfs dfs -ls /
  531  hdfs dfs -p /test/01/02
  532  clear
  533  hdfs dfs -mkdir -p /test/01/02
  534  hdfs dfs -ls -R /test
  535  hdfs dfs -touchz /test/te.text
  536  hdfs dfs -ls -R /test
  537  hdfs dfs -cp /test/te.text /test/01
  538  hdfs dfs -ls /test/01
  539  hdfs dfs -mv /test/01/te.text /test/02
  540  hdfs dfs -ls -R /test
  541  hdfs dfs -mv /test/01/te.text /test/01/02
  542  hdfs dfd -rm /test/02
  543  hdfs dfs -rm /test/02
  544  hdfs dfs -ls -R /test
  545  hdfs dfs -cp /test/te.text /test/01
  546  hdfs dfs -ls -R /test
  547  hdfs dfs -mv /test/01/te.text /test/01/02
  548  hdfs dfs -ls -R /test
  549  hdfs dfs -mv /test/01/02/te.text /test/01/te.doc
  550  hdfs dfs -ls -R /test
  551  clear
  552  cd 
  553  ls
  554  ll
  555  cd /home/
  556  ls
  557  cd /xiaoni/
  558  cd /xiaoni
  559  cd home/xiaoni/Desktop
  560  ls
  561  ll
  562  cd ..
  563  ll
  564  ls
  565  cd /home/
  566  ls
  567  cd xiaoni
  568  ls
  569  cd Desktop/
  570  ls
  571  cd shell/
  572  ls
  573  cd ..
  574  cd Workspace/
  575  ls
  576  cd Bioinformatics_Linux/
  577  ls
  578  pwd
  579  cd
  580  cd /home/xiaoni/Desktop/Workspace/Bioinformatics_Linux/
  581  ls
  582  hdfs dfs -put ./ifelse.sh /test
  583  hdfs dfs -ls /test
  584  hdfs dfs -copyFromLocal ./withReturn.sh /test
  585  cd
  586  hdfs dfs -ls /test
  587  hdfs dfs -ls -R /test
  588  hdfs dfs -put /home/xiaoni/Desktop/Workspace/Bioinformatics_Linux/operator.sh /test
  589  hdfs dfs -ls /test
  590  hdfs dfs -copyFromLocal /home/xiaoni/Desktop/Workspace/Bioinformatics_Linux/ifelse.sh /test
  591  hdfs dfs -copyFromLocal /home/xiaoni/Desktop/Workspace/Bioinformatics_Linux/1.sh /test
  592  hdfs dfs -ls /test
  593  hdfs dfs -rm /test/1.sh
  594  hdfs dfs -rm /test/withReturn.sh
  595  hdfs dfs -ls /
  596  hdfs dfs -ls /test
  597  hdfs dfs -rm /test/ifelse.sh
  598  hdfs dfs -ls /test
  599  hdfs dfs -get /test/operator.sh /home
  600  hdfs dfs -get /test/operator.sh /home/xiaoni/Desktop/
  601  hdfs dfs -get /test/operator.sh /home/xiaoni/Desktop/operator.sh._COPYING_
  602  hdfs dfs -coptToLocal /test/operator.sh /home
  603  hdfs dfs -coptToLocal -f /test/operator.sh /home
  604  hdfs dfs -text /test/operator.sh
  605  hdfs dfs -tail /test/operator.sh
  606  hdfs dfs -cat /test/operator.sh
  607  pwd
  608  sudo chown -R hadoop /home/hadoop/
  609  sudo nano /etc/sudoers
  610  nano /etc/sudoers
  611  clear
  612  hdfs dfs -du /test
  613  hdfs dfs -du -s /test
  614  hdfs dfs -ls /
  615  ls
  616  cd hadoop-3.2.1/
  617  ls
  618  cat etc/hadoop/hadoop-env.sh
  619  cd
  620  stop-yarn.sh
  621  stop-dfs.sh
  622  su xiaoni
  623  c
  624  cd
  625  hdfs dfs -ls /test
  626  start-dfs.sh
  627  start-yarn.sh
  628  hdfs dfs -ls /test
  629  ls
  630  su xiaoni
  631  cd
  632  start-dfs.sh
  633  start-yarn.sh
  634  stop-all.sh
  635  start-dfs.sh
  636  start-yarn.sh
  637  hdfs dfs -put /home/xiaoni/Desktop/shell/test01.text /
  638  hdfs dfs -ls /home/hadoop/hdfs/datanode
  639  hdfs dfs -ls /home
  640  hdfs dfs -ls /
  641  hdfs dfs -cat /test01.text
  642  cd
  643  jps
  644  hdfs dfs -put /home/xiaoni/Desktop/shell/test01.text /test02.text
  645  hdfs dfs -ls /
  646  hdfs dfs -cat /test02.text
  647  clear
  648  start-dfs.
  649  start-dfs.sh 
  650  kps
  651  jps
  652  vim /home/xiaoni/Desktop/words
  653  hdfs dfs -put /home/xiaoni/Desktop/words /mywords
  654  hdfs dfs -ls /
  655  hdfs dfs -ls /usr/
  656  hdfs dfs -ls /usr
  657  yarn jar /home/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out
  658  yarn jar /home/xiaoni/Desktop/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out
  659  hdfs dfs -ls /
  660  hdfs dfs -ls /out
  661  hdfs dfs -cat /out/part-r-00000
  662  hdfs dfs -get /out /home/xiaoni/Desktop
  663  hdfs dfs -get /out /home/xiaoni/Desktop/out
  664  hdfs dfs -get /home/xiaoni/Desktop/out /out
  665  hdfs dfs -get /home/xiaoni/Desktop/out/ /out
  666  ll
  667  cd hadoop-3.2.1/
  668  hdfs dfs -get /home/xiaoni/Desktop/out/ /out
  669  hdfs dfs -get /out /home/xiaoni/Desktop/out
  670  bin/hdfs dfs -get /out /home/xiaoni/Desktop/out
  671  hdfs dfs -cat /out/part-r-00000
  672  hdfs dfs -get /out 
  673  ll
  674  cd
  675  hdfs dfs -ls /
  676  cd hadoop-3.2.1/
  677  ls
  678  hdfs dfs -rm out/
  679  hdfs dfs -rm out
  680  hdfs dfs -rm /out
  681  hdfs dfs -rm -r /out
  682  ls
  683  cd
  684  hdfs dfs -ls /
  685  hdfs dfs -mv -r /hadoop-3.2.1/out /
  686  cd hadoop-3.2.1/
  687  ls
  688  rm out
  689  rm -r out
  690  ls
  691  cd
  692  yarn jar /home/xiaoni/Desktop/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out
  693  hdfs dfs -ls /
  694  hdfs dfs -ls -r /out
  695  hdfs dfs -cat /out/part-r-00000
  696  history 
  697  bin/hadoop jar /home/xiaoni/Desktop/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out
  698  cd hadoop-3.2.1/
  699  bin/hadoop jar /home/xiaoni/Desktop/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out
  700  bin/hadoop jar /home/xiaoni/Desktop/wc.jar com.df.QF_OnLine.mr.MyWordCount /mywords /out2
  701  ls
  702  cd
  703  hdfs dfs -ls /
  704  hdfs dfs -ls /out
  705  hdfs dfs -ls /out2
  706  hdfs dfs -
  707  hdfs dfs -moveToLocal /out /home/xiaoni/Desktop/
  708  hdfs dfs -get /out /home/xiaoni/Desktop/outnew
  709  hdfs dfs -get /out /home/xiaoni/Desktop/outnew/
  710  hdfs dfs -ls /out
  711  hdfs dfs -get /out/ /home/xiaoni/Desktop/outnew/

  713  chmod 777 /home/xiaoni/Desktop/outnew/
  714  sudo chmod 777 /home/xiaoni/Desktop/outnew/
  715  hdfs dfs -get /out/* /home/xiaoni/Desktop/outnew/
```
