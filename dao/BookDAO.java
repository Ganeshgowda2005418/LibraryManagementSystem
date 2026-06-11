package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class BookDAO {

    public static void addBook(
            int id,
            String title,
            String author,
            int quantity) {

        try {

            Connection conn =
                    DBConnection.connect();

            String sql =
                    "INSERT INTO books VALUES(?,?,?,?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setInt(1, id);
            pst.setString(2, title);
            pst.setString(3, author);
            pst.setInt(4, quantity);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(
                    null,
                    "Book Saved Successfully");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Book ID already exists!");

        }
    }
}