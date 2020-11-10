package com.company;

import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {


	JFrame aFrame = new JFrame("First frame");
	aFrame.setSize(1920, 1080);
	Font headlineFont = new Font("Arial", Font.BOLD, 36);
	aFrame.setVisible(true);
	aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel greeting = new JLabel("Hello");
	aFrame.setLayout(new FlowLayout());
	greeting.setFont(headlineFont);
	aFrame.add(greeting);
	aFrame.setLocationRelativeTo(null);



    }
}
