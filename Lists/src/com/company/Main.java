package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BilListe biler = new BilListe();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    biler.printBiler();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    sorterBiler();
                    break;
            }

        }
    }
    public static void printInstructions() {
        System.out.println("\n Trykk");
        System.out.println("\t 0 - print info");
        System.out.println("\t 1 - print biler");
        System.out.println("\t 2 - legg til bil");
        System.out.println("\t 3 - endre bil");
        System.out.println("\t 4 - fjern bil");
        System.out.println("\t 5 -  Søk");
        System.out.println("\t 6 - Avslutt ");
        System.out.println("\t 7 - Sorter ");
    }

    public static void addItem() {
        System.out.print("Skriv ny bil: ");
        biler.nyBil(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Skriv bil no: ");
        int bilNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Skriv endring: ");
        String endretBil = scanner.nextLine();
        biler.endreBiler(bilNo-1, endretBil);
    }

    public static void removeItem() {
        System.out.print("Skriv bil no: ");
        int bilNo = scanner.nextInt();
        scanner.nextLine();
        biler.fjernBil(bilNo-1);
    }

    public static void searchItem() {
        System.out.println("Søk etter: ");
        String searchItem = scanner.nextLine();
        if(biler.finnBil(searchItem) != null) {
            System.out.println("Fant " + searchItem);
        } else {
            System.out.println(searchItem + " finnes ikke i katalogen");
        }
    }

    public static void sorterBiler(){
        sorterBiler();
        System.out.println(biler);
    }



}
