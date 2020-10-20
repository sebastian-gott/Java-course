package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name;
        String age;

        int properAge;
        name = JOptionPane.showInputDialog(null,
                "Please enter your name");
        age = JOptionPane.showInputDialog(null,
                "Please Enter Age");
        try {
            properAge = Integer.parseInt(age);
            JOptionPane.showMessageDialog(null,
                    "Dear " + name + ",\n in ten years will be " + (properAge + 10) + " years old");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Wrong format");
        }

        StringBuilder str
                = new StringBuilder();

        str.append("Seb");

        System.out.println("String" + str.toString());

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + " and 49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + " and " + doubleNumber;
        System.out.println("LastString is equal to: " + lastString);
    }
}
