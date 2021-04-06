package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHelloFrame extends JFrame implements ActionListener {
    JLabel question = new JLabel("What is your name");
    Font bigFont = new Font("Arial", Font.BOLD, 55);
    Font smallFont = new Font("Arial", Font.PLAIN, 35);
    JTextField answer = new JTextField(10);
    JButton btn = new JButton("Press me");
    JLabel greeting = new JLabel("");
    final int WIDTH = 1200;
    final int HEIGHT = 400;


    public JHelloFrame(){
        super("Hello Frame");
        setSize(WIDTH, HEIGHT);

        question.setFont(bigFont);
        greeting.setFont(smallFont);
        btn.setFont(smallFont);
        answer.setFont(smallFont);

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(question);
        JPanel centralPanel = new JPanel(new FlowLayout());
        centralPanel.add(answer);
        centralPanel.add(btn);
        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(greeting);

        add(topPanel, BorderLayout.PAGE_START);
        add(centralPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.PAGE_END);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = answer.getText();
        String greet = "Hello " + name;
        greeting.setText(greet);
    }
}
