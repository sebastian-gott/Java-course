package com.company;

public class MoreStrings {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for( int i = 0; i < 10; i++ ) {
            builder.append(i);
            builder.append("  ");
        }

        System.out.println(builder);
//        String result = builder.toString();
//
//        System.out.println(result);

        int value1 = 300;
        double value2 = 314;
        short value3 = 5;
        char value4 = 'A';

        StringBuilder builderr = new StringBuilder();
        builderr.append(value1).append("\n");
        builderr.append(value2).append("\n");
        builderr.append(value3).append("\n");
        builderr.append(value4);

        System.out.println(builderr);

        builderr = new StringBuilder("abc");

        //Insert substring at position 2
        builderr.insert(2, "XYZ");
        System.out.println(builderr);

        //Try to find this subsring
        int res = builderr.indexOf("Ze");
        System.out.println(res);

        res = builderr.indexOf("de");
        System.out.println(res);

        builderr = new StringBuilder("Carrot");
        System.out.println(builderr);

        builderr.delete(2,5);
        System.out.println(builderr);

        StringBuilder pom = new StringBuilder("abc");

        pom.replace(1, 2, "XYZ");
        System.out.println(pom);

        builderr = new StringBuilder("Magic");

        for(int i = 0; i < builderr.length(); i++) {
            System.out.println(builderr.charAt(i));
        }


    }
}
