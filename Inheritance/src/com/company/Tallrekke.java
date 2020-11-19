package com.company;

public class Tallrekke {
    public static void main(String[] args) {

        int nummer1=0;
        int nummer2=1;
        int nummer3;
        int count=10;



        while(nummer1 < count)
        {
            nummer3=nummer1+nummer2;
            System.out.print(" " +nummer3);
            nummer1=nummer2;
            nummer2=nummer3;
        }
    }
}
