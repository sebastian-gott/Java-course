package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
//        while(count != 5){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count>100){
//                break;
//            }
//        } while(count != 6);

        int n = 4;
        int finishN = 200;
        int evenNumbersFound = 0;

        while(n <= finishN){
            n++;
            if(!isEvenNumber(n)) {
                continue;
            }

            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number " + n);
        }
        System.out.println("Total even number found " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int n){
        if((n % 2) == 0 ) {
            return true;
        } else {
            return false;
        }
}
}
