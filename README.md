### USER-MODULE-SERVICE
This service just for test only

# Requirement
I'm using :
 - Java 1.8.0_131
 - SpringBoot 1.4.7,
 - Maven ver 3.5.3 for library management,
 - MySql for database,
 - IntelliJ IDEA 2019.2

# Database
I'm using another repository in this github for the queries of the databases.
You can download/clone the queries from https://github.com/michaeltyoo/user-module-database.
You need to create database with  :

 - name = "pretest"
 - username = "root" 
 - password = (I set it empty)
 
before you import the queries. Or if you want to create database with another name, username, password, please sync it to the source, you can open \src\main\resources\application.properties on "spring.datasource" lines and change it to the same your own database configurations.

# Port
In this service, I'm using port 8080, if you want to change (just in case port 8080 is already in used by your machine), you can update at \src\main\resources\application.properties on "server.port" line

# Support Dependencies (SWAGGER)

If you wanna test this service, I already add swagger dependencies so you can test this service in swagger-ui.html to make it easier to test
you can open : localhost:[YOUR_PORT]/swagger-ui.html#/

# For pretest, 
  I already follow the REQUESTS and RESPONSES and you can test from :
  
  - (If you test / open from swagger) user-module-resource  -->  /api/user_module/findAllModuleByUserId/{userId}
        with userId as parameter (you can see the database for the values or check it on /api/user_module/all)
        
  or,
        
  - (If you open from web browser) http://localhost:8080/api/user_module/findAllModuleByUserId/{userId}
        with userId as parameter (you can see the database for the values or check it on /api/user_module/all)
        
  - I also add another simple service like findAll, findById, and some insert and update, you can check all the services if you open it at Swagger UI
        
Sorry if there is a lot of disadvantages

Thanks for Read Me ^^
        
        
        
        

  
  
      
