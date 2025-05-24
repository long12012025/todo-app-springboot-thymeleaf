# 📝 Todo App - Spring Boot + Thymeleaf

A full-stack web application that allows users to manage a todo list.  
Built with Spring Boot, Thymeleaf, Bootstrap, and follows clean architecture principles.


## 🚀 Features

- Add / Edit / Delete todo items
- Mark todos as completed
- Toggle between completed / uncompleted
- In-memory H2 database (or persistent option)
- Thymeleaf + Bootstrap UI
- Clean separation: Controller → Service → Repository

## 🔧 Tech Stack

- Java 17
- Spring Boot 3.5.x
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database (in-memory or file-based)
- Bootstrap 5

## 📦 Project Structure

src
└── main
├── java
│ └── com.example.demo
│ ├── controller
│ ├── service
│ ├── entity
│ └── repository
└── resources
├── templates/
└── application.properties
## ▶️ Run Locally

### 🛠 Prerequisites:
- JDK 17+
- Maven 3.8+

### 💻 Commands:
```bash
git clone https://github.com/long12012025/todo-app-springboot-thymeleaf.git
cd todo-app-springboot-thymeleaf
mvn spring-boot:run
