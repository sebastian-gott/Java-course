package Arrayss;

import java.util.ArrayList;

public class MyArray {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Seb");
        names.add("Sindre");
        names.add("Adrian");
        names.add(1, "Kris");
        System.out.println(names);
    }
}
