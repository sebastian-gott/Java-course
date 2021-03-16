package exampleSeven;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){

        Path file = Paths.get("E:\\javaTest\\Data.txt");
        String s = "";
        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null){
                System.out.println(s);
                s = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
