package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEV}
    public static void main(String[] args) {
	// write your code here
        Month birthMonth;
        Month checkError;
        String userEntry;
        int position;
        int comparison;
        Scanner input = new Scanner(System.in);

        for(Month mon : Month.values()){
            System.out.print(mon + " ");
        }

        System.out.println("\n\n Enter the first three letters of " + "your birth month>>");
        userEntry = input.nextLine().toUpperCase();
        birthMonth = Month.valueOf(userEntry);

        System.out.println("You entered " + birthMonth);
        position = birthMonth.ordinal();
        System.out.println(birthMonth + " is in position " + position);
        System.out.println("So its month number is " + (position + 1));
        comparison = birthMonth.compareTo(Month.JUN);

        if(comparison < 0) {
            System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
        } else if(comparison > 0) {
            System.out.println(birthMonth + " is later in the year than " + Month.JUN);
        }
    }
}
