import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

public class exampleEight {
    public static void main(String[] args) {
        Path file = Paths.get("E:\\javaTest\\Data.txt");
        String s = "DELETE ALL THIS TEXT\n";
        byte[] data = s.getBytes();
        OutputStream output = null;
        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.write(data);
            output.flush();
            output.close();
            System.out.println("Endring gjennomført");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
