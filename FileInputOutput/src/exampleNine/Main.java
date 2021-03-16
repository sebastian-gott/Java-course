package exampleNine;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("E:\\javaTest\\Data.txt");
        String s = "";
        String delimiter = ", ";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("Enter employee ID number >> ");
            id = input.nextInt();
            while(id != QUIT) {
                System.out.println("Enter name for employee " + id + " >> ");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter pay rate >>");
                payRate = input.nextDouble();
                s = id + delimiter + name + delimiter + payRate;
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.println("Enter next ID or QUIT " + QUIT + " to quit");
                id = input.nextInt();
            }
            writer.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
