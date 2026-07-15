# 📚 NCERT Books Price List Management System

The NCERT Books Price List Management System is a Full Stack web application designed to manage NCERT book records and their prices efficiently. The application enables users to view book details while allowing administrators to manage book information through CRUD operations. It is built using Java Spring Boot, MySQL, HTML, CSS, and JavaScript following a layered architecture.

---

## 📌 Features

- 📖 View NCERT books with prices
- ➕ Add new books
- ✏️ Update existing book details
- ❌ Delete books
- 🔍 Search books by title
- 💾 Store data in MySQL database
- 📱 Responsive user interface
- 🔗 RESTful API integration
- ⚡ Fast and user-friendly interface

---

## 🛠️ Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Bootstrap

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Maven

### Database
- MySQL

### Tools
- Git
- GitHub
- IntelliJ IDEA
- VS Code
- Postman

---

## 📂 Project Structure

```
NCERT-Books-Price-List/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── entity/
│   │   │   └── application/
│   │   │
│   │   ├── resources/
│   │   │   └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/yourusername/NCERT-Books-Price-List.git
```

---

### Configure Database

Create a MySQL database

```sql
CREATE DATABASE ncert_books;
```

Update

```
application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ncert_books
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

### Run Application

```bash
mvn clean install
mvn spring-boot:run
```

Application runs at

```
http://localhost:8080
```

---

## 📡 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /books | Get all books |
| GET | /books/{id} | Get book by ID |
| POST | /books | Add new book |
| PUT | /books/{id} | Update book |
| DELETE | /books/{id} | Delete book |

---

## 🗄️ Database

The application uses MySQL to store:

- Book ID
- Book Name
- Class
- Subject
- Price
- Publisher

---

## 🚀 Future Enhancements

- User Authentication
- Admin Dashboard
- Shopping Cart
- Online Book Purchase
- Razorpay Payment Gateway
- Book Images
- Category Filters
- Search & Sorting
- Inventory Management
- PDF Invoice Generation

---

## 📷 Screenshots

Add screenshots here.

Example

```
images/homepage.png

images/book-list.png

images/admin-dashboard.png
```

---

## 💻 Skills Demonstrated

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- REST API Development
- MySQL
- HTML
- CSS
- JavaScript
- Bootstrap
- CRUD Operations
- MVC Architecture
- Maven
- Git & GitHub
- Object-Oriented Programming

---

## 📖 Learning Outcomes

- Developed a complete Full Stack web application.
- Designed RESTful APIs using Spring Boot.
- Implemented CRUD operations with MySQL.
- Applied MVC architecture and layered design.
- Practiced database integration using Spring Data JPA.
- Improved Git version control workflow.

---

## 👩‍💻 Author

**Geetanjali Khurana**

B.Tech Computer Science Engineering (DevOps & Data Science)

Lovely Professional University

GitHub: https://github.com/geetanjalikhurana
---

## 📄 License

This project is created for educational and portfolio purposes.
