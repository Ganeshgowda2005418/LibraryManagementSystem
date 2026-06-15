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

    public static void deleteBook(int id) {

        try {

            Connection conn =
                    DBConnection.connect();

            String sql =
                    "DELETE FROM books WHERE book_id = ?";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setInt(1, id);

            int rows =
                    pst.executeUpdate();

            if (rows > 0) {

                JOptionPane.showMessageDialog(
                        null,
                        "Book Deleted Successfully");

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Book Not Found");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
public static void updateBook(
        int id,
        String title,
        String author,
        int quantity) {

    try {

        Connection conn =
                DBConnection.connect();

        String sql =
                "UPDATE books SET title=?, author=?, quantity=? WHERE book_id=?";

        PreparedStatement pst =
                conn.prepareStatement(sql);

        pst.setString(1, title);
        pst.setString(2, author);
        pst.setInt(3, quantity);
        pst.setInt(4, id);

        int rows =
                pst.executeUpdate();

        if(rows > 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Book Updated Successfully");

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Book Not Found");

        }

    } catch(Exception e) {

        e.printStackTrace();

    }
        }
public static String[] searchBook(int id) {

    try {

        Connection conn =
                DBConnection.connect();

        String sql =
                "SELECT * FROM books WHERE book_id=?";

        PreparedStatement pst =
                conn.prepareStatement(sql);

        pst.setInt(1, id);

        var rs = pst.executeQuery();

        if(rs.next()) {

            return new String[] {

                    rs.getString("title"),
                    rs.getString("author"),
                    String.valueOf(
                            rs.getInt("quantity"))

            };

        }

    } catch(Exception e) {

        e.printStackTrace();

    }

    return null;
}
}