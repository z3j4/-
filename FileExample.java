
import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, World!");
            writer.close();
            FileReader reader = new FileReader(fileName);
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}