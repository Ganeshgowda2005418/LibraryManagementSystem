package ui;

import javax.swing.*;

public class HomeFrame extends JFrame {

    public HomeFrame() {

        setTitle("Library Management System");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton addBookBtn = new JButton("Add Book");
        addBookBtn.setBounds(120, 50, 150, 40);

        JButton viewBooksBtn = new JButton("View Books");
        viewBooksBtn.setBounds(120, 110, 150, 40);

        JButton deleteBookBtn = new JButton("Delete Book");
        deleteBookBtn.setBounds(120, 170, 150, 40);

        JButton updateBookBtn = new JButton("Update Book");
        updateBookBtn.setBounds(120, 230, 150, 40);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(120, 290, 150, 40);

        add(addBookBtn);
        add(viewBooksBtn);
        add(deleteBookBtn);
        add(updateBookBtn);
        add(exitBtn);

        addBookBtn.addActionListener(e -> {
            new AddBookFrame();
        });

        viewBooksBtn.addActionListener(e -> {
            new ViewBooksFrame();
        });

        deleteBookBtn.addActionListener(e -> {
            new DeleteBookFrame();
        });

        updateBookBtn.addActionListener(e -> {
            new UpdateBookFrame();
        });

        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}