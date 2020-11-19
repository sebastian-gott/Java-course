package swingoving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class EventListener extends JFrame implements ActionListener {

    String colors[] = {"Blue", "Black", "Yellow", "Green", "Purple"};
    JLabel question = new JLabel("What is your favorite color?");
    JTextField answer = new JTextField(10);
    JComboBox answer1 = new JComboBox(colors);
    JButton button = new JButton("Submit");
    JLabel results = new JLabel("");


    public EventListener () {
        super("Favoritt farge");
        setLayout(new FlowLayout());
        add(question);
        add(answer);
        add(answer1);
        add(button);
        add(results);
        answer1.addActionListener(this);
        button.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        String color = answer.getText();
        String data = "" + answer1.getItemAt(answer1.getSelectedIndex());
        String result = "Your favorite color is " + color;
        results.setText(result);
        answer.setText(data);

    }

}
