package com.company;

import javax.swing.*;

public class arraysTwo {

    public static void main (String[] args) {
        final int NUMBER_OF_ITEMS = 8;
        int[] validValues = {201, 203, 502, 2301, 492, 987, 264, 138};
        double[] prices = {3.22, 34.23, 9.34, 5.43, 35.23};
        String strItem;
        int itemOrdered;
        double itemPrice = 0.0;
        boolean isValidItem = false; //If correct value is entered this will change to true
        strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order");
        itemOrdered = Integer.parseInt(strItem);

        for(int x = 0; x < NUMBER_OF_ITEMS; ++x) {
            if(itemOrdered == validValues[x]) {
                isValidItem = true;
                itemPrice = prices[x];
                break;
            }
        }

        if(isValidItem) {
            JOptionPane.showMessageDialog(null, "The price for the item " +
                    itemOrdered  + " is $" + itemPrice);
        } else {
            JOptionPane.showMessageDialog(null, "This item does not exist in the catalog");
        }
    }
}
