# JDBC_Demo

A simple Java JDBC project that connects to a MySQL database and retrieves student records using JDBC.

## Project Overview

This project demonstrates how to connect a Java application to MySQL using JDBC, execute SQL queries, and display student information from a database.

## Technologies Used

- Java 21
- JDBC (Java Database Connectivity)
- MySQL 8
- MySQL Connector/J
- Visual Studio Code
- Git and GitHub

## Project Structure

```text
JDBC_Demo/
├── .vscode/
│   └── settings.json
├── src/
│   └── JdbcDemo.java
├── lib/
│   └── mysql-connector-j-<version>.jar
├── bin/
├── .gitignore
└── README.md
```

## Features

- Connects Java to a MySQL database.
- Retrieves student records using SQL.
- Displays student ID, name, and city.
- Uses JDBC `Connection`, `Statement`, and `ResultSet`.
- Automatically closes database resources using try-with-resources.
- Includes exception handling for database errors.

## Database Setup

Create the database and student table in MySQL Workbench.

```sql
CREATE DATABASE IF NOT EXISTS jdbc_demo;

USE jdbc_demo;

CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL
);

INSERT INTO student (id, name, city) VALUES
(1, 'Amit', 'Pune'),
(2, 'Rahul', 'Mumbai'),
(3, 'Priya', 'Nashik');

SELECT * FROM student;
```

If you have already inserted these records, do not execute the same `INSERT` statements again, because duplicate primary-key errors may occur.

## Prerequisites

Install or configure the following:

1. Java JDK 21
2. Visual Studio Code
3. MySQL Server 8
4. MySQL Connector/J
5. Git
6. A GitHub account (for publishing the project)

## Configuration

1. Download MySQL Connector/J.
2. Place the downloaded JAR file inside the `lib` folder.
3. Open `src/JdbcDemo.java`.
4. Configure the database URL, username, and password.

Example:

```java
String url = "jdbc:mysql://localhost:3306/jdbc_demo";
String username = "root";
String password = "YOUR_MYSQL_PASSWORD";
```

Replace the sample password with your local MySQL password. Never publish actual database credentials.

## How to Compile and Run

Open the VS Code terminal in the project root directory.

### Compile

Replace `<version>` with the actual version in your Connector/J JAR filename.

```powershell
javac -cp "lib\mysql-connector-j-<version>.jar" -d bin src\JdbcDemo.java
```

### Run

```powershell
java -cp "bin;lib\mysql-connector-j-<version>.jar" JdbcDemo
```

## Expected Output

```text
MySQL Connected Successfully!
ID | NAME | CITY
----------------
1 | Amit | Pune
2 | Rahul | Mumbai
3 | Priya | Nashik
```

The output depends on the records available in your database.

## Common Errors

- **Communications link failure:** Check whether MySQL Server is running and the connection URL is correct.
- **Access denied:** Verify your MySQL username, password, and permissions.
- **Driver not found:** Check the Connector/J JAR location and classpath.
- **Duplicate entry:** Check whether the student ID already exists.
- **Class not found:** Compile the program and verify the runtime classpath.

## Learning Outcomes

After completing this project, you will understand:

- How JDBC connects Java applications to MySQL.
- How to create a database connection using `DriverManager`.
- How to execute SQL queries using `Statement`.
- How to retrieve records using `ResultSet`.
- How to compile and run a Java JDBC program.
- How to use Git and GitHub for source code management.

## Future Enhancements

- Insert student records using `PreparedStatement`.
- Search students by city.
- Implement CRUD operations (Create, Read, Update, Delete).
- Improve input validation and exception handling.

## Author

Prajwal Raimal

**Batch:** 1340

## License

This project is created for educational and practice purposes.
