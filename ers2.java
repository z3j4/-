import java.io.*;

public class ers2 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        try (FileOutputStream out = new FileOutputStream("d:/def.txt")) {
            byte[] b = str.getBytes();
            out.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}