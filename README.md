# REST TODO - API

### A clean, lightweight RESTful API built with Java and Spring Boot to manage daily tasks.

This project demonstrates core backend engineering fundamentals, including 3-tier Layered Architecture, Spring Data JPA persistence, constructor-based dependency injection, and proper entity model design.

---

## 🛠️ Tech Stack And Tools

- **Language:** Java 17+
- **Framework:** Spring Boot (Spring Web, Spring Data JPA)
- **Database:** H2
- **ORM Framework:** Hibernate
- **Boilerplate Reduction:** Lombok (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`)
- **Build Tool:** Maven
- **API Testing:** Postman

---

## 📂 Project Structure & Architecture

The application follows the standard 3-tier layered backend architecture for separation of concerns:

```
src/main/java/com/example/todo/
│
├── controller/
│   └── TodoController.java      # REST controller handling HTTP requests
│
├── entity/
│   └── ToDo.java                # Entity model mapping the database table
│
├── repository/
│   └── ToDoRepository.java      # Spring Data JPA interface for DB operations
│
├── service/
│   └── ToDoService.java         # Core business logic layer
│
└── TodoApplication.java         # Main class (Spring Boot entry point)
```

**Request flow:** Client → Controller → Service → Repository → Database

---

## 🔌 API Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/list` | Fetch all todos | - |
| `POST` | `/add` | Add a new todo | `{"title": "Study Spring Boot"}` |
| `DELETE` | `/deleteID/{id}` | Delete a todo by ID | - |

---

## 📬 Sample Requests & Responses

### 1. Add a Todo

**Request:** `POST /add`

```json
{
  "title": "Learn Spring Boot"
}
```

**Response:**

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "isComplete": false
}
```

### 2. Get All Todos

**Request:** `GET /list`

**Response:**

```json
[
  {
    "id": 1,
    "title": "Learn Spring Boot",
    "isComplete": false
  }
]
```

### 3. Delete a Todo

**Request:** `DELETE /deleteID/1`

**Response:**

```
given id->1is deleted
```

---

## 🚀 How to Run Locally

### Prerequisites

- Java 17 or higher
- Maven (optional, the Maven Wrapper `mvnw` is included)
- Postman (for testing the endpoints)

### Steps

1. Clone the repository
   ```bash
   git clone https://github.com/TusharPandeydev/todo-api-SpringBoot.git
   cd todo-api-SpringBoot
   ```
2. Run the application
   ```bash
   mvn spring-boot:run
   ```
   Or, using the Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
   (On Windows: `mvnw.cmd spring-boot:run`)
3. The server will start at `http://localhost:8080`
4. Test the endpoints using Postman

---

## 💡 Key Concepts Learned

- **Layered Architecture:** Controller → Service → Repository
- **Package-by-layer structure:** Separate `controller`, `entity`, `service` and `repository` packages
- **Spring Data JPA:** CRUD operations through `JpaRepository` without writing SQL
- **Wrapper classes vs primitives:** `Integer` and `Boolean` can hold `null` values, while `int` and `boolean` cannot
- **`@GeneratedValue(strategy = IDENTITY)`:** The database auto-generates the primary key
- **`@RequestBody` & `@PathVariable`:** Extracting data from the request body and URL
- **Lombok:** Annotations like `@Data`, `@AllArgsConstructor` and `@NoArgsConstructor` reduce boilerplate code

---

## 👤 Author

- GitHub: [Tushar Pandey](https://github.com/TusharPandeydev)


