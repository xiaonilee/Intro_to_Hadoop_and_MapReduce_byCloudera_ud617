   # Install the Java prerequisite
   ```
       $ sudo apt update
       $ sudo apt install openjdk-8-jdk openjdk-8-jre
    ```
   
   # Configure passwordless SSH
   ## Install the OpenSSH Server and OpenSSH Client package
   ```
       $ sudo apt install openssh-server openssh-client
   ```

   ## Create Hadoop user account
   ```
       $ sudo adduser hadoop
   ```

   ## Log into the hadoop user account 
   ```
       $ su hadoop
   ```
   
   ## Generate public and private key pairs
   ```
       $ ssh-keygen -t rsa
   ```
   ## Copy the newly generated RSA key in id_rsa.pub over to authorized_keys:
   ```
       $ cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys
   ```
   ## Verify the configuration for SSH
   ```
       $ ssh localhost
   ```
   
   
   # Install Hadoop
   ## Download Hadoop 3.2.1
   ```
       $ wget https://downloads.apache.org/hadoop/common/hadoop-3.2.1/hadoop-3.2.1.tar.gz
   ```
   ## Extract the download to the hadoop user's home directory
   ```
       $ tar -xzvf hadoop-3.2.1.tar.gz -C /home/hadoop
   ```
   
   
   # Set up the environment variable
   ```
       $ nano .bashrc 
   ```
   ### copy and paste:
       export HADOOP_HOME=/home/hadoop/hadoop-3.1.3
       export HADOOP_INSTALL=$HADOOP_HOME
       export HADOOP_MAPRED_HOME=$HADOOP_HOME
       export HADOOP_COMMON_HOME=$HADOOP_HOME
       export HADOOP_HDFS_HOME=$HADOOP_HOME
       export YARN_HOME=$HADOOP_HOME
       export HADOOP_COMMON_LIB_NATIVE_DIR=$HADOOP_HOME/lib/native
       export PATH=$PATH:$HADOOP_HOME/sbin:$HADOOP_HOME/bin
       export HADOOP_OPTS="-Djava.library.path=$HADOOP_HOME/lib/native"
   
   ### Source the .bashrc file
   ```
       $ source .bashrc 
   ```
       
   #  Make some changes to the hadoop-env.sh file
   ```
       $ nano ~/hadoop-3.2.1/etc/hadoop/hadoop-env.sh
   ```
       ### Copy and paste:
       export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64


   # Configuration changes in core-site.xml file
   ```
       $ nano $HADOOP_HOME/etc/hadoop/core-site.xml
   ```
   #### Enter the following configuration, which instructs HDFS to run on localhost port 9000 and sets up a directory for temporary data.
               
   
   ```
   hadoop@xiaoni-VirtualBox:~/hadoop-3.2.1$ cat etc/hadoop/core-site.xml 
	
		<configuration>
		<property>
		  <name>fs.defaultFS</name>
		  <value>hdfs://localhost:9000</value>
		</property>
		<property>
		  <name>hadoop.tmp.dir</name>
		  <value>/home/hadoop/hadooptmpdata</value>
		</property>
		</configuration>

   ```
    
   
   # Create the directory in which temporary data will be stored:
   ```
       $ mkdir ~/hadooptmpdata
   ```
    
    
   # Configuration changes in hdfs-site.xml file
   
   ## Create two new directories for Hadoop to store the Namenode and Datanode information.
   ```
       $ mkdir -p ~/hdfs/namenode ~/hdfs/datanode
       $ ls
       $ ls hdfs
   ```
   ## Edit the following file to tell Hadoop where to find those directories:
   
   	$ nano $HADOOP_HOME/etc/hadoop/hdfs-site.xml
   ``` 
   #### Make the following changes to the hdfs-site.xml file, before saving and closing it:
  
   hadoop@xiaoni-VirtualBox:~/hadoop-3.2.1/etc/hadoop$ cat hdfs-site.xml
   
			<configuration>
			    <property>
				<name>dfs.replication</name>
				<value>1</value>
			    	<name>dfs.name.dir</name>
				<value>file:///home/hadoop/hdfs/namenode</value>
				<name>dfs.data.dir</name>
				<value>file:///home/hadoop/hdfs/datanode</value>

			    </property>

			</configuration>   
   ```
   
   ``` 
        $ ls hdfs/
   
   # Configuration changes in mapred-site.xml file
   ```
       $ nano hadoop-3.2.1/etc/hadoop/mapred-site.xml 
   ```
   ```
   hadoop@xiaoni-VirtualBox:~/hadoop-3.2.1/etc/hadoop$ cat mapred-site.xml
   
			<configuration>
			    <property>
				<name>mapreduce.framework.name</name>
				<value>yarn</value>
			    </property>
			   <property>
				<name>mapreduce.application.classpath</name>
				<value>$HADOOP_MAPRED_HOME/share/hadoop/mapreduce/*:$HADOOP_MAPRED_HOME/share/hadoop/mapreduce/lib/*</value>
			    </property>
			</configuration>

   
   ```
   
   
   #### Make the following changes to the hdfs-site.xml file, before saving and closing it:
   
   
   
   
   # Configuration changes in yarn-site.xml file
   ```
       $ nano hadoop-3.2.1/etc/hadoop/yarn-site.xml 
   ```

   #### Add the following entries in this file, before saving the changes and closing it:
  ```
  hadoop@xiaoni-VirtualBox:~/hadoop-3.2.1/etc/hadoop$ cat yarn-site.xml
  
			  <configuration>

			    <property>
				<name>yarn.nodemanager.aux-services</name>
				<value>mapreduce_shuffle</value>
			    </property>
			    <property>
				<name>yarn.nodemanager.env-whitelist</name>
				<value>JAVA_HOME,HADOOP_COMMON_HOME,HADOOP_HDFS_HOME,HADOOP_CONF_DIR,CLASSPATH_PREPEND_DISTCACHE,HADOOP_YARN_HOME,HADOOP_MAPRED_HOME</value>
			    </property>

			</configuration>

  ```
   
   
   
   # Starting the Hadoop cluster
   
   ## Before using the cluster for the first time, we need to format the namenode
   ```
       $ hdfs namenode -format
   ```

   # Start the HDFS by using the start-dfs.sh script
   ```
       $ start-dfs.sh 
   ```

   # Start the YARN by using the start-yarn.sh script
   ```
       $ start-yarn.sh 
   ```
       
   # Verify all the Hadoop services/daemons are started successfully with he jps command
   ```
       $ jps 
   ```

   # Check the current Hadoop version
   ```
       $ hadoop version
   ``` 
       
   # HDFS Command Line Interface
   ## The HDFS command line is used to access HDFS and to create directories or issue other commands to manipulate files and directories. 
   ## Use the following command syntax to create some directories and list them:
   ```
       $ hdfs dfs -mkdir /test
       $ hdfs dfs -mkdir /hadooponubuntu
       $ hdfs dfs -ls /
   ```
       
       
   # Access the Namenode Web UI
        http://127.0.0.1:42019
   
   # Access the YARN Resource Manager web interface
        http://127.0.0.1:8088
   
   
   
   
   
     
