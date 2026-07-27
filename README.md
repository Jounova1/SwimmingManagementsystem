# Swimming Management System

A full-stack swimming club management system built using **Spring Boot**, **Spring Security**, **Thymeleaf**, **JPA/Hibernate**, and **MySQL**.

The system provides role-based access control for managing swimmers, coaches, and managers in a swimming organization.

---

# 🚀 Technologies Used

- Java 25
- Spring Boot 4
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- Spring Security
- Thymeleaf
- MySQL Database
- Maven

---

# 📌 Project Features

## 🔐 Authentication & Authorization

The system uses **Spring Security** to provide login and role-based permissions.

Users are divided into three roles:

---

## 👨‍💼 Manager Role

Manager has full control over the system.

Features:

- Login
- Manage coaches
- Manage swimmers
- View all system data

---

## 🏊 Coach Role

Coach manages swimmers.

Features:

- Login
- Create swimmers
- Edit swimmer information
- Delete swimmers
- View assigned swimmers

---

## 🏅 Swimmer Role

Swimmer has limited access.

Features:

- Login
- View personal profile
- View personal information

---

# 🏗️ System Architecture

```
                Manager

                   |
                   |
             manages coaches

                   ↓


                Coach

                   |
                   |
             manages swimmers

                   ↓


               Swimmer
```

---

# 🔒 Security Architecture

Spring Security uses database-based authentication.

Database structure:

```
Users

   |
   |
User_Roles

   |
   |

Roles
```

Example:

```
manager1  → MANAGER

coach1    → COACH

swimmer1  → SWIMMER
```

---

# 🗄️ Database Design

The project uses MySQL.

Main tables:

## Users Table

Stores authentication information:

- id
- username
- password
- enabled


## Roles Table

Stores available roles:

- MANAGER
- COACH
- SWIMMER


## User_Roles Table

Connects users with roles.


## Manager Table

Stores manager information:

- id
- first name
- last name
- user account


## Coaches Table

Stores coach information:

- id
- first name
- last name
- age
- team
- user account


## Swimmer Table

Stores swimmer information:

- id
- first name
- last name
- age
- team
- assigned coach
- user account

---

# 📂 Project Structure

```
src/main/java/com/swimming/demo

│
├── Controller
│   ├── ManagerController
│   ├── CoachController
│   └── SwimmerController
│
├── Service
│   ├── ManagerService
│   ├── CoachService
│   └── SwimmerService
│
├── Repo
│   ├── UserRepository
│   ├── CoachRepository
│   └── SwimmerRepository
│
├── entity
│   ├── User
│   ├── Role
│   ├── Manager
│   ├── Coach
│   └── Swimmer
│
└── Security
    ├── SecurityConfig
    └── CustomUserDetailsService
```

---

# 🌐 Web Interface

The project uses **Thymeleaf** for server-side rendering.

Pages include:

```
templates

├── login.html

├── manager
│   ├── dashboard.html
│   ├── coaches.html
│   └── swimmers.html

├── coach
│   ├── dashboard.html
│   ├── add-swimmer.html
│   └── edit-swimmer.html

└── swimmer
    └── profile.html
```

---

# ⚙️ How To Run

## 1. Clone Repository

```bash
git clone https://github.com/jounova1/SwimmingManagementsystem.git
```

---

## 2. Configure Database

Open:

```
src/main/resources/application.properties
```

Add your MySQL configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/swimmers_db

spring.datasource.username=root

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
```

---

## 3. Run Application

Using Maven:

```bash
mvn spring-boot:run
```

or run:

```
DemoApplication.java
```

---

# 🔑 Default Accounts

| Username | Role |
|----------|------|
| manager1 | MANAGER |
| coach1 | COACH |
| swimmer1 | SWIMMER |

---

# 📈 Future Improvements

Planned features:

- Training session management
- Swimming race results
- Athlete performance tracking
- Attendance system
- Team management
- Performance analytics
- AI swimming technique analysis
- Mobile application integration

---

# 👨‍💻 Author

**Youssef Wael**

Computer Science Student

Spring Boot Backend Developer
