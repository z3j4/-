import java.io.*;

public class ll {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write("Hello, World!".getBytes());
            fos.close();
            FileInputStream fis = new FileInputStream(fileName);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}