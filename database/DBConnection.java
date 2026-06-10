package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connect() {
        try {

            Class.forName("org.sqlite.JDBC");

            Connection conn =
                DriverManager.getConnection("jdbc:sqlite:library.db");

            System.out.println("Database Connected");

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}