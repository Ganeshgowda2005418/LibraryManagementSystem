package ui;

import javax.swing.*;

public class HomeFrame extends JFrame {

    public HomeFrame() {

        setTitle("Library Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton addBookBtn = new JButton("Add Book");
        addBookBtn.setBounds(120, 50, 150, 40);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(120, 170, 150, 40);       
        JButton viewBooksBtn = new JButton("View Books");
        viewBooksBtn.setBounds(120, 110, 150, 40);
        JButton deleteBookBtn = new JButton("Delete Book");
        deleteBookBtn.setBounds(120, 190, 150, 40);
        exitBtn.setBounds(120, 260, 150, 40);
        add(addBookBtn);
        add(exitBtn);
        add(viewBooksBtn);
        add(deleteBookBtn);
        addBookBtn.addActionListener(e -> {
            new AddBookFrame();
        });
        viewBooksBtn.addActionListener(e -> {
        new ViewBooksFrame();
        });
        deleteBookBtn.addActionListener(e -> {
        new DeleteBookFrame();
        });
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}