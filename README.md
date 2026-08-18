# 📚 Nova Library — Library Management System

**Nova Library** is a web-based Library Management System built using **Java, Spring Boot, Spring Data JPA, and Maven**. The application provides a simple interface for managing books, authors, categories, and publishers through a structured backend architecture.

The project follows a layered architecture with separate **Controller, Service, Repository, and Entity** layers, making the application modular and easier to maintain.

---

## ✨ Features

* 📚 **Book Management**

  * Add books
  * View books
  * View book details
  * Edit books
  * Delete books

* ✍️ **Author Management**

  * Add authors
  * View authors
  * Edit authors
  * Delete authors

* 🏷️ **Category Management**

  * Add categories
  * View categories
  * Edit categories
  * Delete categories

* 🏢 **Publisher Management**

  * Add publishers
  * View publishers
  * Edit publishers
  * Delete publishers

* 🔗 Entity relationships between books, authors, categories, and publishers

* 🗄️ Persistent database storage

* 🌐 Web-based interface

* ⚙️ Spring Boot configuration profiles

* 🧩 Layered application architecture

---

# 🛠️ Tech Stack

### Backend

* ☕ Java
* 🌱 Spring Boot
* 🔗 Spring Data JPA
* 🌐 Spring MVC
* 📦 Maven

### Frontend

* HTML
* CSS
* Thymeleaf

### Database

* Relational Database
* JPA / Hibernate

### Development Tools

* Visual Studio Code / IntelliJ IDEA
* Git
* GitHub

---

# 🏗️ System Architecture

```text
                    ┌─────────────────────┐
                    │       Browser       │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │    Controller       │
                    │       Layer         │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │      Service        │
                    │       Layer         │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │     Repository      │
                    │       Layer         │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │      Database       │
                    └─────────────────────┘
```

### Application Flow

```text
User Request
     ↓
Controller
     ↓
Service
     ↓
Repository
     ↓
Database
     ↓
Response
     ↓
User Interface
```

---

# 📂 Project Structure

```text
LibraryManagement/
│
├── .mvn/
│   └── wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── net/Xforce/LibraryManagement/
│   │   │       │
│   │   │       ├── Controller/
│   │   │       │   ├── AuthorController.java
│   │   │       │   ├── BookController.java
│   │   │       │   ├── CategoryController.java
│   │   │       │   ├── HomeController.java
│   │   │       │   └── PublisherController.java
│   │   │       │
│   │   │       ├── Entities/
│   │   │       │   ├── Author.java
│   │   │       │   ├── Book.java
│   │   │       │   ├── Category.java
│   │   │       │   └── Publisher.java
│   │   │       │
│   │   │       ├── Repositories/
│   │   │       │   ├── AuthorRepository.java
│   │   │       │   ├── BookRepositories.java
│   │   │       │   ├── CategoryRepository.java
│   │   │       │   └── PublisherRepository.java
│   │   │       │
│   │   │       ├── Service/
│   │   │       │   ├── AuthorService.java
│   │   │       │   ├── BookService.java
│   │   │       │   ├── CategoryService.java
│   │   │       │   └── PublisherService.java
│   │   │       │
│   │   │       └── LibraryManagmentApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       └── application-prod.properties
│   │
│   └── test/
│
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

# 📸 Application Screenshots

## 🏠 Home Page

The Nova Library landing page provides navigation to the major library management modules and displays a featured collection.

<p align="center">
  <img width="1600" height="919" alt="home" src="https://github.com/user-attachments/assets/bc5fd639-811f-42ec-a825-c5da41fb141f" />

</p>

---

## 📚 Book Management

The Book Management section displays the available books along with their ISBN, description, details, edit, and delete operations.

<p align="center">
  <img width="1600" height="696" alt="book" src="https://github.com/user-attachments/assets/35f99d42-205d-4c68-b391-4b3c32c19053" />

</p>

---

## ✍️ Author Management

The Author Management section allows users to view, add, edit, and delete authors.

<p align="center">
  <img width="1600" height="751" alt="author" src="https://github.com/user-attachments/assets/7d20c54e-dd49-4761-8351-5493cf53a6b5" />

</p>

---

## 🏷️ Category Management

The Category Management section provides CRUD operations for organizing books into different categories.

<p align="center">
  <img width="1600" height="737" alt="category" src="https://github.com/user-attachments/assets/8463a8fb-6f07-4d16-958a-6d9b49083cc7" />

</p>

---

## 🏢 Publisher Management

The Publisher Management section allows users to manage publishers associated with the library's books.

<p align="center">
  <img width="1600" height="701" alt="publisher" src="https://github.com/user-attachments/assets/3029fa8c-7507-499b-a057-91689ea9e6d8" />

</p>

---

## 🔎 Book Details

The Book Details page displays detailed information about an individual book, including its ISBN, category, author, publisher, and description.

<p align="center">
  <img width="1600" height="621" alt="bookdetails" src="https://github.com/user-attachments/assets/63542375-f94e-4b03-9fa3-d11f41ab1fca" />

</p>

---

# 🔄 CRUD Operations

The application implements CRUD functionality across the main library resources.

| Resource       | Create | Read | Update | Delete |
| -------------- | :----: | :--: | :----: | :----: |
| 📚 Books       |    ✅   |   ✅  |    ✅   |    ✅   |
| ✍️ Authors     |    ✅   |   ✅  |    ✅   |    ✅   |
| 🏷️ Categories |    ✅   |   ✅  |    ✅   |    ✅   |
| 🏢 Publishers  |    ✅   |   ✅  |    ✅   |    ✅   |

---

# 🧩 Backend Architecture

The backend is divided into four primary layers.

### 🎯 Controller Layer

Handles HTTP requests and maps them to the appropriate application operations.

```text
AuthorController
BookController
CategoryController
HomeController
PublisherController
```

### ⚙️ Service Layer

Contains the application's business logic.

```text
AuthorService
BookService
CategoryService
PublisherService
```

### 🗄️ Repository Layer

Handles persistence and database communication through Spring Data JPA.

```text
AuthorRepository
BookRepositories
CategoryRepository
PublisherRepository
```

### 📦 Entity Layer

Defines the application's core data models.

```text
Author
Book
Category
Publisher
```

---

# ⚙️ Configuration

The application contains separate Spring Boot configuration files:

```text
application.properties
application-dev.properties
application-prod.properties
```

Configure your local database connection before starting the application.

> ⚠️ **Security:** Never commit database passwords, API keys, tokens, or other sensitive credentials to GitHub.

---

# 🚀 Installation & Setup

## 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/LibraryManagement.git
```

## 2. Navigate to the Project

```bash
cd LibraryManagement
```

## 3. Configure the Database

Update the required database configuration in:

```text
src/main/resources/application.properties
```

## 4. Run the Application

### Windows

```bash
.\mvnw.cmd spring-boot:run
```

### Linux / macOS

```bash
./mvnw spring-boot:run
```

Or, if Maven is installed:

```bash
mvn spring-boot:run
```

## 5. Open the Application

After the application starts successfully, open:

```text
http://localhost:8080
```

> The port may differ if it has been changed in the application configuration.

---

# 🧪 Testing

Run the project's tests using Maven:

```bash
.\mvnw.cmd test
```

For Linux/macOS:

```bash
./mvnw test
```

---

# 🌱 Spring Profiles

The application supports environment-specific configuration through Spring Boot profiles.

```text
application.properties
application-dev.properties
application-prod.properties
```

This allows development and production configurations to be maintained separately.

---

# 🔮 Future Improvements

* 🔐 User Authentication & Authorization
* 👥 Role-Based Access Control
* 🔎 Advanced Book Search
* 📊 Library Dashboard
* 📅 Book Issue & Return Management
* ⏰ Due Date & Fine Management
* 📖 Book Availability Tracking
* 📱 Mobile-Friendly Improvements
* 📋 Swagger / OpenAPI Documentation
* 🧪 Expanded Unit & Integration Testing

---

# 👨‍💻 Author

## Ankit Kumar

Computer Science & Engineering

<p>
  <a href="https://github.com/Ankitkumar445">
    <img src="https://img.shields.io/badge/GitHub-Ankitkumar445-181717?style=for-the-badge&logo=github" alt="GitHub">
  </a>
  <a href="https://www.linkedin.com/in/ankit-kumar-035083304/">
    <img src="https://img.shields.io/badge/LinkedIn-Ankit%20Kumar-0A66C2?style=for-the-badge&logo=linkedin" alt="LinkedIn">
  </a>
  <a href="https://selfprofile-phi.vercel.app/">
    <img src="https://img.shields.io/badge/Portfolio-Visit-8A2BE2?style=for-the-badge" alt="Portfolio">
  </a>
</p>

---

<p align="center">
  ⭐ If you find this project useful, consider giving it a star.
</p>
```
