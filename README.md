# Light-spring-app

This is a sample Java application built using Spring framework and Hibernate ORM. The application demonstrates how to build a simple REST API with basic CRUD (Create, Read, Update, Delete) operations using Spring Boot, Hibernate and MySQL database.

The application is built with the following technologies:

* Java 8 <br/>
* Spring Boot 2.5.4<br/>
* Hibernate 5.4.32.Final<br/>
* MySQL 8.0.25<br/>

This application demonstrates:<br/>

How to set up a Spring Boot project with Hibernate ORM<br/>
How to use Spring Data JPA to interact with a database<br/>
How to implement CRUD operations using Hibernate and Spring Data JPA<br/>
How to implement validation using Hibernate Validator<br/>
How to handle exceptions and errors in a Spring Boot application<br/>

Requirements:<br/>
* JDK 8 or higher<br/>
* Maven 3.2 or higher<br/>
* MySQL 8.0 or higher<br/>

Running the Application:<br/>
* Clone the repository: git clone https://github.com/MartinDobos22/Light-spring-app.git<br/>
* Navigate to the project directory: cd <repository-name><br/>
* Open application.properties file and update the MySQL database details according to your system configuration.<br/>
* Build the project using Maven: mvn clean package<br/>
* Run the application: java -jar target/<jar-file-name>.jar<br/>

API Endpoints<br/>
The application exposes the following REST endpoints:<br/>

* GET /api/users: Get all users<br/>
* GET /api/users/{id}: Get user by ID<br/>
* POST /api/users: Create a new user<br/>
* PUT /api/users/{id}: Update an existing user<br/>
* DELETE /api/users/{id}: Delete a user by ID<br/>


Contribution:
If you find any issues with this application or want to contribute to this project, please feel free to submit a pull request.
