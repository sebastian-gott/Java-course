package com.company;

import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	JFrame aFrame = new JFrame("First frame");
	aFrame.setSize(1920, 1080);
	Font headlineFont = new Font("Arial", Font.BOLD, 36);
	aFrame.setVisible(true);
	JLabel greeting = new JLabel("Hello");
	greeting.setFont(headlineFont);
	aFrame.add(greeting);
	aFrame.setLocationRelativeTo(null);


    }
}
