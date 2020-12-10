##黄瓯涵

##资料
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[Spring文档](https://spring.io/guides/)
[Github Oauth](https://docs.github.com/en/free-pro-team@latest/developers/apps/creating-an-oauth-app)
[Springboot](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
##工具
[Git](https://docs.github.com/en/free-pro-team@latest/developers/overview/managing-deploy-keys#deploy-keys)

##脚本
```sql
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint DEFAULT NULL,
  `gmt_modified` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```