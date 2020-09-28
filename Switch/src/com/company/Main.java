package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 3;

        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChat = 'A';


        switch(switchChat){
            case 'A':
                System.out.println("The value is A");
                break;

            case 'B':
                System.out.println("The value is B");
                break;

            case 'C':
                System.out.println("The value is C");
                break;

            case 'D':
                System.out.println("The value is D");
                break;

            case 'E':
                System.out.println("The value is E");
                break;

            default:
                System.out.println("The value is not A, B, C, D or E. It is " + switchChat);
                break;
        }
    }
}
