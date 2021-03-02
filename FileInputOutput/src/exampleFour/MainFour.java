package exampleFour;

import java.io.IOException;
import java.nio.file.AccessMode;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainFour {

    static String correctFile = "C:\\Users\\Sebastian\\Documents\\javaTest\\Data.txt";

    public static void main(String[] args) {
        Path filePath = Paths.get(correctFile);
        System.out.println("Path is " + filePath.toString());

        try{
            filePath.getFileSystem().provider().checkAccess(filePath, AccessMode.READ, AccessMode.EXECUTE);
            System.out.println("File can be used");
        } catch (IOException e) {
            System.out.println("File cannot be used");
        }

    }
}
