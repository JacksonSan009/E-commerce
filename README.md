# E-Commerce 

E-commerce web application with Java Spring Boot.

#### Project status: In progress.

## Image Preview
![Preview](assets/Preview.jpg)

## Features
- [x] Image avatar for users.
- [ ] Be able to login with a Google or Facebook account.
- [ ] Password recuperation with email.
- [ ] Can choose your location with Google Maps API.
- [ ] Responsive design for mobiles.
- [ ] Animations for the front-end.
- [ ] Docker image for the project.
- [ ] Reset password by token.
 
## Configuration
### Manually
In the archive `application.properties` you have to add the next code:
```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/ecommercedb
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=create
```

Wich is configured in port 3306, in **ecommercedb** database on MySql.

If is the first time you run the program in your database, you can change
the hibernate properties to **auto** or **create**, and then change again to **none**.

```
spring.jpa.hibernate.ddl-auto=none
```

That way hibernate will create the tables the first time, and the next ones wouldn't restart 
the tables in the next runs.


## Technologies and Library's
* JQuery 3.5.1
* JUnit 5
* [Java Adopt OpenJDK 8 OpenJ9](https://adoptopenjdk.net/)
* Maven 4.0
* Spring Boot 2.4.2
* [JavaDoc 3.3.0](http://maven.apache.org/plugins/maven-javadoc-plugin/index.html)
* [W3 Style](https://www.w3schools.com/w3css/)
* [Xampp 8.0.7 (PHP 8.0.7)](https://www.apachefriends.org/download.html)


