package headfirstjava.serialization;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {
    public static void main(String[] args) {
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter("s.txt");
            fileWriter.write("hi");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File object
        //File f = new File("s.txt");
        /*
        File dir = new File("Chapter7");
        dir.mkdir();
        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (String dirContent : dirContents) {
                System.out.println(dirContent);
            }
        }
        //boolean isDeleted = f.delete();

         */
        try {
            Files.lines(Path.of("Some.txt"))
                    .forEach(one -> System.out.println(one));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String toTest = "What is blue + yellow?/green";
        String[] result= toTest.split("/");
        for (String a : result) {
            System.out.println(a);
        }
    }
}
