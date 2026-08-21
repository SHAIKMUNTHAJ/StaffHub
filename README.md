# StaffHub

StaffHub is a Spring Boot-based microservices application designed to manage employee and address information using REST APIs.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST API
- Microservices
- Maven
- Postman

## Features

- Employee management
- Address management
- RESTful APIs
- CRUD operations
- MySQL database integration
- Spring Data JPA integration
- Communication between Employee and Address services
- API testing using Postman

## Microservices

### Employee Service

Responsible for managing employee information such as:

- Employee ID
- Name
- Email
- Employee details

### Address Service

Responsible for managing address information such as:

- Address ID
- City
- State
- Address details

## Project Structure

StaffHub
├── Employee
│   ├── src
│   └── pom.xml
│
└── addressservice
    ├── src
    └── pom.xml

## How to Run

1. Clone the repository.
2. Import both microservices into Eclipse, IntelliJ IDEA, or Spring Tool Suite.
3. Configure MySQL in the respective `application.properties` files.
4. Start the Address Service.
5. Start the Employee Service.
6. Test the REST APIs using Postman.

## GitHub

https://github.com/SHAIKMUNTHAJ/StaffHub

## Author

Munthaj
