import java.io.*;
public class ers4{
public static void main(String[ ]args)throws Exception {
FileWriter writer =new FileWriter("d:/tt.txt");
String str="program\r\nl love java~ ";
writer.write(str);
writer.write(" \r\n");
writer.close();
}
}