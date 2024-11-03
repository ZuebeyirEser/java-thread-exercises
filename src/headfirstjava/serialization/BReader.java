package headfirstjava.serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BReader {
    public static void main(String[] args) {
        try {
            File myFile = new File("Some.txt");
            FileWriter writer = new FileWriter(myFile);
            writer.write("ASDDAS 1\n");
            writer.write("ASDDAS 2\n");
            writer.write("ASDDAS 3\n");
            writer.write("ASDDAS 4\n");
            writer.close();

            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
