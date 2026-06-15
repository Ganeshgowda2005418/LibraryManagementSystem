package ui;

import dao.BookDAO;
import javax.swing.*;

public class SearchBookFrame extends JFrame {

    public SearchBookFrame() {

        setTitle("Search Book");
        setSize(500,350);
        setLayout(null);

        JLabel idLabel =
                new JLabel("Book ID");

        idLabel.setBounds(20,20,100,30);

        JTextField idField =
                new JTextField();

        idField.setBounds(120,20,200,30);

        JButton searchBtn =
                new JButton("Search");

        searchBtn.setBounds(340,20,100,30);

        JLabel titleLabel =
                new JLabel("Title:");

        titleLabel.setBounds(20,80,400,30);

        JLabel authorLabel =
                new JLabel("Author:");

        authorLabel.setBounds(20,120,400,30);

        JLabel quantityLabel =
                new JLabel("Quantity:");

        quantityLabel.setBounds(20,160,400,30);

        add(idLabel);
        add(idField);
        add(searchBtn);

        add(titleLabel);
        add(authorLabel);
        add(quantityLabel);

        searchBtn.addActionListener(e -> {

            int id =
                    Integer.parseInt(
                            idField.getText());

            String[] book =
                    BookDAO.searchBook(id);

            if(book != null) {

                titleLabel.setText(
                        "Title: " + book[0]);

                authorLabel.setText(
                        "Author: " + book[1]);

                quantityLabel.setText(
                        "Quantity: " + book[2]);

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Book Not Found");

            }

        });

        setVisible(true);
    }
}