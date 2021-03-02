package exampletwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args){
        Path filePath = Paths.get("C:\\Users\\Sebastian\\Documents\\javaTest\\Data.txt");
        try{
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Last modified " + attr.lastModifiedTime());
            System.out.println("Size " + attr.size());
        } catch (IOException e){
            System.out.println("IO exception");
        }
    }
}
