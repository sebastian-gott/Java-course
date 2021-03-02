package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Sebastian\\Documents\\javaTest\\Data.txt");
        int count = filePath.getNameCount();
        System.out.println("Path is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("There are " + count + " elements in the file path");
        for(int i = 0; i < count; ++i) {
            System.out.println("Element is " + i + " in " + filePath.getName(i));
        }

        
    }
}
