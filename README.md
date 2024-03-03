# Spring Boot Login Page Example

<img width="958" alt="image" src="https://github.com/Sathvik-Rao/SpringBoot_Login/assets/36164509/e78b86ca-6e37-44c0-ad3f-a24eacf06dba">


This project is a simple login page implemented using Spring Boot. Below are some key details about the project:

## Database

The login page utilizes a PostgreSQL database for storing user credentials and other relevant information.

## Spring Boot Starter Security

The login form is created using `spring-boot-starter-security`, which provides robust authentication and authorization features out of the box.

## Spring Boot Version

This project is built with Spring Boot version 3.2.3.

## Authorization

Access to Home page2 is restricted to users with the ROLE_ADMIN privilege.

## Before Running the Project

Before running this project, make sure you complete the following steps:

1) **Enter database name, username and password in "application.properties" file.**
   
<img width="893" alt="image" src="https://github.com/Sathvik-Rao/SpringBoot_Login/assets/36164509/bbb4ce94-81a2-4e83-ab86-b52731ad3bc9">

2) **In your database create the following table**

```
CREATE TABLE usert (id int primary key,
				   username varchar(100),
				   password varchar(100),
				   role varchar(100));
```

3) **In your database insert the user details**

```
INSERT INTO usert (id, username, password, role) values 
	(1, 'user1', '$2a$10$Rd0QuZhnLMVBzmJRkm3vNujZiTzUBhmxh0Rdd0XAPoMyb10K5YwmG', 'ROLE_USER'),	--password = pass1
	(2, 'user2', '$2a$10$FzdzNyXJIn1nRIKXRLLWmOmmSFLBdvMQgaMO6kdPHpvg94Vth0H52', 'ROLE_USER'),	--password = pass2
	(3, 'admin', '$2a$10$z303SZBL1330WhDyuMvltuA/Q0OlK6Bc4wdWRqewvIoX0JksYvCWq', 'ROLE_ADMIN'); --password = pass3
```
The passwords are encoded using the Bcrypt hashing method. You can use a tool like (https://www.browserling.com/tools/bcrypt) to generate bcrypt hashes for passwords. For example, for the password pass1 with 10 rounds, the bcrypt hash is $2a$10$Rd0QuZhnLMVBzmJRkm3vNujZiTzUBhmxh0Rdd0XAPoMyb10K5YwmG.




