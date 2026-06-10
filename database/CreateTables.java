package database;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTables {

    public static void createTables() {

        try {

            Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();

            String books = """
                CREATE TABLE IF NOT EXISTS books(
                    book_id INTEGER PRIMARY KEY,
                    title TEXT,
                    author TEXT,
                    quantity INTEGER
                );
                """;

            String members = """
                CREATE TABLE IF NOT EXISTS members(
                    member_id INTEGER PRIMARY KEY,
                    name TEXT,
                    department TEXT
                );
                """;

            String issuedBooks = """
                CREATE TABLE IF NOT EXISTS issued_books(
                    issue_id INTEGER PRIMARY KEY,
                    book_id INTEGER,
                    member_id INTEGER,
                    issue_date TEXT,
                    return_date TEXT
                );
                """;

            stmt.execute(books);
            stmt.execute(members);
            stmt.execute(issuedBooks);

            System.out.println("All tables created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}