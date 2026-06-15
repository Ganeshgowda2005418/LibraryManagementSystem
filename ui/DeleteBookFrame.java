package ui;

import dao.BookDAO;
import javax.swing.*;

public class DeleteBookFrame extends JFrame {

    public DeleteBookFrame() {

        setTitle("Delete Book");
        setSize(400,250);
        setLayout(null);

        JLabel idLabel = new JLabel("Book ID");
        idLabel.setBounds(20,50,100,30);

        JTextField idField = new JTextField();
        idField.setBounds(120,50,200,30);

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setBounds(120,120,100,30);

        add(idLabel);
        add(idField);
        add(deleteBtn);

        deleteBtn.addActionListener(e -> {

            int id =
                    Integer.parseInt(idField.getText());

            BookDAO.deleteBook(id);

            idField.setText("");

        });

        setVisible(true);
    }
}