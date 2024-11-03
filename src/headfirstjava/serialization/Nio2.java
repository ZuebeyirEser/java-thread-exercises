package headfirstjava.serialization;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
public class Nio2 {
    public static void main(String[] args) {
        try {
            Path myPath = Paths.get("MyFile.txt");
            BufferedWriter writer = Files.newBufferedWriter(myPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
