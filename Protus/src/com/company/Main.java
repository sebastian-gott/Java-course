package com.company;

public class Main {

    public static void main(String[] args) {

        //String str = "Hello";
        String output;


       // String doubleLetter = str.substring(str.length() -1);
        //output = doubleLetter + doubleLetter;

        //System.out.println(output);

        String out = "<<>>";
        String word = "Yes";
        String str;
        int index = 0;


        str = out.substring(0, 2) + word + out.substring(2,4);

        System.out.println(str);

        String str1 = "fis";

        boolean answer;

        String str1Start = str1.substring(0,1);
        String str1End = str1.substring(str1.length() -1);

        if(str1Start.equals("f") && str1End.equals("b")) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);



//        int a = 4;
//        int b = 4;
//        int c = 1;
//        int result = 0;
//
//        if(a != b && a != c && b != a && b != c && c != a && c != b) {
//            result = 0;
//        } else if (a == b && c == a && c == b) {
//            result = 20;
//        } else {
//            result = 10;
//        }

//        int a = 3;
//        int b = 9;
//        boolean result;
//
//        if (a + b == 6 || a - b == 6 || b - a == 6) {
//            result = true;
//        } else {
//            result = false;
//        }

        int n = 23;
        boolean result;

        if (n / 2 == 11 || 11*2+1 == n){
            result = true;
        } else {
            result = false;
        }


        System.out.println(result);




//        if(a + b == c || a + c == b || c + b == a) {
//            result = true;
//        } else {
//            result = false;
//        }


    }
}
