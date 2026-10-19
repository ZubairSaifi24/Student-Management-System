# Student Management System

A Java-based Student Management System developed using Core Java, JDBC, MySQL, and Maven. The project is organized into separate packages to improve code structure and maintainability.

## Features

- Student management through a Java application
- MySQL database connectivity using JDBC
- Separate Controller, Model, and Service packages
- Student model for representing student information
- Database utility classes for connection and query operations
- Maven-based dependency management

## Technologies Used

- Java 17
- JDBC
- MySQL
- SQL
- Maven
- Eclipse IDE

## Project Structure

```text
Student_Management_System/
├── src/
│   ├── com.Database/
│   │   ├── DatabaseConnection.java
│   │   ├── DbDetails.java
│   │   └── Helper.java
│   ├── Controller/
│   │   └── StudentController.java
│   ├── main/
│   │   └── Main.java
│   ├── model/
│   │   └── Student.java
│   └── service/
│       ├── StudentService.java
│       └── StudentServiceImpl.java
├── pom.xml
└── README.md
```

## Prerequisites

- JDK 17 or compatible Java environment
- MySQL Server
- Maven
- Eclipse IDE or another Java IDE

## Setup and Execution

1. Clone or download this repository.
2. Create the required MySQL database and student table.
3. Configure the database URL, username, and password in the project's database configuration.
4. Ensure the required MySQL JDBC driver dependency is configured in `pom.xml`.
5. Import the project into Eclipse as a Maven project.
6. Run `main.Main` to start the application.

## Learning Objectives

- Practice Core Java and object-oriented programming.
- Understand JDBC and relational database connectivity.
- Organize code using Controller, Model, and Service packages.
- Practice Maven project configuration and dependency management.

## Author

Zubair Saifi

GitHub: https://github.com/ZubairSaifi24

LinkedIn: https://linkedin.com/in/zubair-saifi-04308b330
