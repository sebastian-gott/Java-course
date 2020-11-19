package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

class ValidPrice {
    public int validValues;
    public double price;
    ValidPrice(int validValues, double price) {
        this.validValues = validValues;
        this.price = price;
    }
}

public class RemoveSpace {
    public static void main(String[] args) {
            ValidPrice[] arr;
            arr = new ValidPrice[10];
            arr[0] = new ValidPrice(101, 0.29);





            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].validValues + " " + arr[i].price);
            }



        }
    }

