package exampleFive;

import java.io.IOException;
import java.nio.file.*;

public class MainFive {
    public static void main(String[] args) {
        Path filPath = Paths.get("C:\\Users\\Sebastian\\Documents\\javaTest\\finnes.txt");

        try{
            Files.delete(filPath);
        } catch(NoSuchFileException e) {
            System.out.println("No Such file");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty");
        } catch (SecurityException e) {
            System.out.println("Dont have perms");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
