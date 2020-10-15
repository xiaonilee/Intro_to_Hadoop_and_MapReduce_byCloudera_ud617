```
521  xiaoni@xiaoni-VirtualBox:~$ vim ./withReturn.sh
522  chmod 744 ./withReturn.sh 
523  ./withReturn.sh 
```
 
 
### hadoop@xiaoni-VirtualBox与xiaoni@xiaoni-VirtualBox共享tmp文件夹
  
```
583  ls /tmp/
```

### 将tmp文件夹下的文件拷贝到/home/xiaoni/Desktop/中：
```
588  cp -a /tmp/hadoopExample.md /home/xiaoni/Desktop/
589  ls
  
  
966  xiaoni@xiaoni-VirtualBox:~$ mkdir outnew
967  ls
```

### 在xiaoni@xiaoni-VirtualBox:账户下赋给hadoop权限
```
968  chmod 777 /home/xiaoni/Desktop/outnew/
```  

### 在xiaoni@xiaoni-VirtualBox:账户下修改文件权限
```
971  sudo chmod 777 /home/xiaoni/Desktop/outnew/ -R
```
