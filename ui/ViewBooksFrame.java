package ui;

import database.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewBooksFrame extends JFrame {

    public ViewBooksFrame() {

        setTitle("View Books");
        setSize(700,400);

        String[] columns = {
                "Book ID",
                "Title",
                "Author",
                "Quantity"
        };

        DefaultTableModel model =
                new DefaultTableModel(columns,0);

        JTable table = new JTable(model);

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        try {

            Connection conn =
                    DBConnection.connect();

            Statement stmt =
                    conn.createStatement();

            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM books");

            while(rs.next()) {

                model.addRow(new Object[]{

                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("quantity")

                });

            }

        } catch(Exception e) {

            e.printStackTrace();

        }

        setVisible(true);
    }
}