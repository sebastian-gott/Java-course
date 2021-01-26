package com.company;
import java.lang.*;

public class eksamen111 {

    public static int firstMultiple(int a, int b) {
        int greaterA = 0;
        for(int i = 0; a < b; i ++) {
            greaterA =+ a*i;
            if(greaterA > b) {
                break;
            }
        }
        return greaterA;
    }

    /*public static int gcd(int a, int b, int c) {

        int sammeDivider = 1;
        for(int i =1; i <= a && i <= b && i <= c; i++) {
            if(a % i == 0 && b % i == 0 && c % i == 0) {
                sammeDivider = i;
            }
        }
        return sammeDivider;
    }*/

    public static String specialConcatenate(String str1, String str2) {
        String str3;
        str3 = str1.substring(1) + str2.substring(1);
        return str3;
    }

    public static void main(String[] args) {

        System.out.println(firstMultiple(5, 10));
       /* System.out.println(gcd(2, 4, 6));*/

        System.out.println(specialConcatenate("Hello", "There"));



    }
}
