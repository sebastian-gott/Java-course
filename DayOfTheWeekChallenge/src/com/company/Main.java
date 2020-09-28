package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(5);
    }


    private static void printDayOfTheWeek (int day){

        switch (day){
            case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println(day + " day of the week");
                break;

            default:
                System.out.println("invalid day");
        }
        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5 || day == 6){
            System.out.println(day + " day of the week");
        } else {
            System.out.println("Invalid day");
        }
    }
}
