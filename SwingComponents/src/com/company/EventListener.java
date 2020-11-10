package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventListener extends JFrame implements ActionListener {

    JLabel question = new JLabel("How old are you?");
    JTextField answer = new JTextField(10);
    JButton press = new JButton("Click");
    JLabel greeting = new JLabel("");

    public EventListener(){
        super("TEst");
        setLayout(new FlowLayout());
        add(question);
        add(answer);
        add(press);
        add(greeting);
        press.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String age = answer.getText();
        String greet = "Hello, " + age + " y/o scum";
        greeting.setText(greet);

    }


}
