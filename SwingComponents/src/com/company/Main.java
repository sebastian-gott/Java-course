package com.company;

import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {


		int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		for(int i = 0; i < array.length; i++) {
			if(i == array.length / 2) {
				System.out.println(i);
			}
		}




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
