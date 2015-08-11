
==============================
SPORTS STORE DEMO
==============================

Technologies used

1. Spring Boot 
Spring Boot integrates the whole application with Spring Security,Spring MVC 
and Spring Rest Support

2. Persistence Layer
DAO layer is built using Spring JPA Repository support

3. Database Scripts
Db scripts are available under  [Project Root]/src/main/scripts/ folder

4. Database connectivity configuration
Please configure application specific DB detail in 
[Project Root]/src/main/resources/application.properties


6. Generating Executable jar
Navigate to [Project Root]
$ mvn package  
$ java -jar target/sports-store-0.0.1-SNAPSHOT.jar

View DEMO
=========
1> On the Browser go to http://localhost;8080/sportsstore/
2> Provide default username password  admin admin
3> Click on "get All Products"  to receive all products configured in DB via REST API. 


