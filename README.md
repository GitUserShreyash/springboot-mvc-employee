# springboot-mvc-employee
Simple springboot mvc application which performs simple operation like registering, editing and deleting operation on employee data present in database
# Spring Boot MVC Employee Management Application

A simple Spring Boot MVC web application to perform CRUD operations on Employee records.

---

## 🚀 Features

- Add New Employee
- View All Employees
- Edit Employee Details
- Delete Employee
- Implements Post-Redirect-Get (PRG) Pattern
- MVC Architecture

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA 
- Hibernate
- JSP
- MySQL 
- Maven

---

## 📂 Project Structure

```
springboot-mvc-employee
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── shreyash
│   │   │           └── demo
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repo
│   │   │               ├── service
│   │   │               ├── ServletInitializer.java
│   │   │               └── SpringMvc6CrudApplication.java
│   │   │
│   │   ├── resources
│   │   │   ├── static
│   │   │   ├── templates
│   │   │   └── application.properties
│   │   │
│   │   └── webapp
│   │       ├── images
│   │       │   ├── addicon.png
│   │       │   ├── deleteicon.png
│   │       │   ├── editicon.jpg
│   │       │   └── reporticon.jpg
│   │       │
│   │       └── WEB-INF
│   │           └── pages
│   │               ├── employee_edit.jsp
│   │               ├── employee_register.jsp
│   │               ├── employee_report.jsp
│   │               └── home.jsp
│   │
│   └── test
│
├── pom.xml
└── README.md
```

## ⚙️ How to Run the Project

1. Clone the repository 
    ```
    git clone https://github.com/GitUserShreyash/springboot-mvc-employee.git
2. Open the project in IntelliJ / Eclipse

3. Configure database in `application.properties`

4. Run `SpringMvc6CrudApplication.java`

5. Open browser and go to:
    ```
    http://localhost:8080/Employee-CRUDOperations

## 🧠 Concepts Implemented

- Spring MVC Controller Mapping
- Model and View Handling
- Request Scope & RedirectAttributes
- BeanUtils Property Copy
- CRUD Operations
- Layered Architecture
- JSP View Resolver Configuration

## 👨‍💻 Author

Shreyash  
GitHub: https://github.com/GitUserShreyash

