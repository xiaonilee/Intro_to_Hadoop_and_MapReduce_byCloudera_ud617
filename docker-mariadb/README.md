### 通过docker，docker-compose 部署mariadb server 和 phpmyadmin（mariadb gui client）


```
sudo chmod a+x docker-utils.sh
sudo ./docker-utils.sh -a install
sudo usermod -a -G docker xiaoni
docker-compose up [-d]
```

##### 访问phpmyadmin

* http://127.0.0.1:8080

##### 关闭 mariadb

```
docker-compose down

```
