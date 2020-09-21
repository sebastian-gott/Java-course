package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(5);
    }

        public static void checkNumber (int parameterNumber){
            if (parameterNumber > 0) {
                System.out.println("Positive");
            } else if (parameterNumber < 0) {
                System.out.println("Negative");
            } else if (parameterNumber == 0) {
                System.out.println("Zero");
            }
        }
    }

