# Library Management System (Console-Based)

A robust, terminal-based application built with **Core Java** to manage library operations. This project demonstrates the application of Object-Oriented Programming (OOP) principles and efficient data management using the Java Collections Framework.

## 🚀 Key Features
* **Book Management:** Add, view, and track library books.
* **Search Functionality:** Optimized searching using `HashMap` for $O(1)$ time complexity.
* **Transaction Logic:** Handle issuing and returning of books with real-time status updates.
* **Error Handling:** Robust input validation using `try-catch` blocks to prevent system crashes.

## 🛠️ Tech Stack & Java Concepts Used
* **Language:** Java (JDK 8 or higher)
* **OOPs Concepts:** * **Encapsulation:** Used private fields and getters/setters in the `Book` model.
    * **Abstraction:** Implemented an Interface (`ILibraryService`) to decouple logic from implementation.
    * **Inheritance:** (If applicable) Organized user roles.
* **Collections:** Used `ArrayList` for dynamic storage and `HashMap` for fast data retrieval.
* **Architecture:** Followed **Clean Architecture** by separating code into `model`, `service`, and `main` packages.

## 📁 Project Structure
- `com.library.model`: Contains the Book POJO.
- `com.library.service`: Contains the Business Logic and Interfaces.
- `com.library.main`: The entry point containing the User Interface (CLI).

## 💻 How to Run
1. Clone the repository: `git clone <your-repo-link>`
2. Open the project in Eclipse or any Java IDE.
3. Run `LibraryApp.java` as a Java Application.
