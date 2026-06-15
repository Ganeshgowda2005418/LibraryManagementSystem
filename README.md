# Library Management System

## Overview

Library Management System is a Java Swing desktop application developed as part of the MCA Object-Oriented Programming with Java project. The application uses SQLite as the database and JDBC for database connectivity.

## Features

### Create

* Add new books to the library database.

### Read

* View all books in a table format.

### Update

* Update existing book details.

### Delete

* Delete books using Book ID.

### Search

* Search for a book by Book ID.

## Technologies Used

* Java
* Java Swing
* SQLite
* JDBC
* Git & GitHub

## Project Structure

```text
LibraryManagementSystem
│
├── database
│   ├── DBConnection.java
│   └── CreateTables.java
│
├── dao
│   └── BookDAO.java
│
├── ui
│   ├── HomeFrame.java
│   ├── AddBookFrame.java
│   ├── ViewBooksFrame.java
│   ├── UpdateBookFrame.java
│   ├── DeleteBookFrame.java
│   └── SearchBookFrame.java
│
├── lib
│   └── sqlite-jdbc.jar
│
└── Main.java
```

## Database

### Books Table

| Column   | Type                |
| -------- | ------------------- |
| book_id  | INTEGER PRIMARY KEY |
| title    | TEXT                |
| author   | TEXT                |
| quantity | INTEGER             |

## How to Run

1. Clone the repository.
2. Add the SQLite JDBC driver to the project.
3. Compile the project:

```bash
javac -cp ".;lib/*" Main.java database/*.java dao/*.java ui/*.java
```

4. Run the application:

```bash
java -cp ".;lib/*" Main
```

## Screenshots

* Home Screen
  <img width="483" height="677" alt="Screenshot 2026-06-15 223425" src="https://github.com/user-attachments/assets/045d4b4e-d870-4312-aa53-a53aba65ce9c" />

* Add Book
  <img width="611" height="479" alt="Screenshot 2026-06-15 223543" src="https://github.com/user-attachments/assets/7f2751f9-e4ad-4da1-96b9-138600fc6c8f" />

* View Books
  <img width="861" height="394" alt="Screenshot 2026-06-15 223736" src="https://github.com/user-attachments/assets/cd3e001d-c5ec-4c59-9581-676ce6269bd2" />
* Update Book
  <img width="573" height="642" alt="Screenshot 2026-06-15 224204" src="https://github.com/user-attachments/assets/bdbe3742-76e1-40d6-9ebe-5596129a6596" />

* Delete Book
  <img width="484" height="507" alt="Screenshot 2026-06-15 223828" src="https://github.com/user-attachments/assets/a887148e-6076-446c-a2ca-e1343e5121d2" />




* Search Book
  <img width="599" height="415" alt="Screenshot 2026-06-15 223902" src="https://github.com/user-attachments/assets/2ef5bace-1242-4234-99a5-bf759e655812" />


## Author

Ganesha B T

MCA Student | Aspiring Software Development Engineer (SDE)
