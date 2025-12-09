
# 🎬 Movie Library – Spring Boot Web Application

A full-stack **Movie Library Management System** built using **Spring Boot**, **Spring Security**, **Thymeleaf**, and **MySQL/H2**.
It includes authentication, role-based access, movie browsing, booking, and admin control.

This project demonstrates clean backend architecture, proper security configuration, and a functional MVC web application.

---

## 🚀 Features

### 🔐 **User Authentication**

* Custom login page using Spring Security
* Passwords encrypted with BCrypt
* Session-based login

### 🧑‍💼 **Role-Based Access**

| Role      | Permissions                              |
| --------- | ---------------------------------------- |
| **ADMIN** | Add movies, view all movies, book movies |
| **USER**  | View movies, book movies                 |

### 🎞️ **Movie Management**

* List all movies
* Add new movies (Admin only)
* Book a movie

### 🌐 **Frontend**

* Fully rendered with **Thymeleaf**
* Clean and simple UI

---

## 🛠️ Tech Stack

### Backend

* Java 17+
* Spring Boot
* Spring MVC
* Spring Security
* Hibernate / JPA

### Frontend

* Thymeleaf
* HTML5, CSS3

### Database

* MySQL (or H2 for testing)

### Build Tool

* Maven

---

## 📁 Project Structure

```
src/
 └── main/
      ├── java/com/ty/movielibrary
      │      ├── controllers
      │      ├── models
      │      ├── repositories
      │      ├── services
      │      ├── SecurityConfig.java
      │      └── MovieLibraryApplication.java
      └── resources/
            ├── templates (Thymeleaf pages)
            ├── static (CSS, JS)
            └── application.properties
```

---

## 🔧 How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/movie-library.git
cd movie-library
```

### 2️⃣ Configure the database

In `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movielibrary
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Run the application

From Eclipse/IntelliJ:
➡️ Run `MovieLibraryApplication.java`

Or using terminal:

```bash
mvn spring-boot:run
```

### 4️⃣ Access the app

```
http://localhost:8080/login
```

---

## 👤 Default Users (Auto-Created)

| Username  | Password | Role  |
| --------- | -------- | ----- |
| **admin** | admin123 | ADMIN |
| **user**  | user123  | USER  |

---

## 🔐 Security Configuration (Highlights)

* CSRF disabled for simplicity
* Custom login page at `/login`
* Access rules:

  ```text
  /login → Public  
  /addMovie → ADMIN only  
  /movies, /book → ADMIN & USER  
  ```

---

## 📌 Screenshots (Optional)

You can add these later:

* Login page
* Movie list
* Add movie page

---

## 📚 Future Enhancements

* Movie search bar
* Pagination
* User registration
* Movie booking history
* Upload movie posters

---

## 🙌 Author

**Nicole Mercy Daison**
**NicoLee75**
---

If you want, I can also create:

* A **professional GitHub description**
* A **repository banner**
* A **LICENSE file**

Just tell me!
