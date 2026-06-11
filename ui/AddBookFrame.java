package ui;

import dao.BookDAO;
import javax.swing.*;

public class AddBookFrame extends JFrame {

    public AddBookFrame() {

        setTitle("Add Book");
        setSize(500, 400);
        setLayout(null);

        JLabel idLabel = new JLabel("Book ID");
        idLabel.setBounds(20, 20, 100, 30);

        JTextField idField = new JTextField();
        idField.setBounds(120, 20, 250, 30);

        JLabel titleLabel = new JLabel("Title");
        titleLabel.setBounds(20, 70, 100, 30);

        JTextField titleField = new JTextField();
        titleField.setBounds(120, 70, 250, 30);

        JLabel authorLabel = new JLabel("Author");
        authorLabel.setBounds(20, 120, 100, 30);

        JTextField authorField = new JTextField();
        authorField.setBounds(120, 120, 250, 30);

        JLabel quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(20, 170, 100, 30);

        JTextField quantityField = new JTextField();
        quantityField.setBounds(120, 170, 250, 30);

        JButton saveBtn = new JButton("Save");
        saveBtn.setBounds(170, 250, 100, 35);

        add(idLabel);
        add(idField);

        add(titleLabel);
        add(titleField);

        add(authorLabel);
        add(authorField);

        add(quantityLabel);
        add(quantityField);

        add(saveBtn);

        saveBtn.addActionListener(e -> {

            int id = Integer.parseInt(idField.getText());

            String title = titleField.getText();

            String author = authorField.getText();

            int quantity = Integer.parseInt(quantityField.getText());

            BookDAO.addBook(
                    id,
                    title,
                    author,
                    quantity);
                    idField.setText("");
                    titleField.setText("");
                    authorField.setText("");
                    quantityField.setText("");

        });

        setVisible(true);
    }
}