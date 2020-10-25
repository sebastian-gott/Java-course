package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Hello";
        String output;


        String doubleLetter = str.substring(str.length() -1);
        output = doubleLetter + doubleLetter;

        System.out.println(output);
    }
}
