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
* Add Book
* View Books
* Update Book
* Delete Book
* Search Book

## Author

Ganesha B T

MCA Student | Aspiring Software Development Engineer (SDE)
