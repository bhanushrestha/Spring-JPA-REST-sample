# Spring-JPA-REST-sample
Simple sample Spring project using Spring Boot for connecting with a mysql database to create a RESTful service

For running this project the following requirements must be met in your device:
- Gradle 2.0 or greater must be installed
- MySql must be installed and running

Steps to setup the project :
- Clone this project to your local workspace.
- run 'cd \path\to\project'<br/>
- run 'gradle eclipse'<br/>
- Import this project to eclipse.
- Create a database and name it 'springRestTest' in your local machine using MySql

Run MainApplication.java to start the system.


URL used : localhost:8080/customer

POST request to create new Customer should be of format :

{
 "firstName":"Jane",
 "lastName":"Doe",
 "status": "ACTIVE"
}
