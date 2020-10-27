package com.company;

import javax.swing.*;

public class arraysThree {
    public static void main (String[] args) {
        final int NUM_RANGES = 5;
        int[] discountRangeLimits = {3, 4, 53, 343, 345};
        double[] discountRates = {0.05, 0.10, 0.15, 0.20, 0.25};
        double customerDiscount;
        String strNumOrdered;
        int numOrdered;
        int sub = NUM_RANGES - 1;
        strNumOrdered = JOptionPane.showInputDialog(null, "How many items ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);

        while( sub >= 0 && numOrdered < discountRangeLimits[sub]) {
            --sub;
            customerDiscount = discountRates[sub];
            JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " +
                    customerDiscount);
        }
    }
}
