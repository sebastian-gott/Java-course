package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String chars = "ABCDEFGH";
        String numbs = "12345678";

        for(int i = 0; i < chars.length(); i++) {
            for(int j = 0; j < numbs.length(); j++){
                if(numbs.charAt(j) == 8) {
                    System.out.println("\n");
                    System.out.print(chars.charAt(i));
                    System.out.print(numbs.charAt(j) );
                }


            }
        }

        System.out.println("\n*******************************");

        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "1 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "2 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "3 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "4 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "5 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "6 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "7 ");
        }
        System.out.println();
        for(int i = 0; i < chars.length(); i++ ){
            System.out.print(chars.charAt(i) + "8 ");
        }
    }
}
