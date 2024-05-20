import java.io.*;public class ety5 {
    public static void main(String[ ]args)throws Exception{
FileReader reader=new FileReader("d/tyty.txt");
int ch;
while((ch=reader.read())!=-1){
System.out.print((char)ch);
}
reader.close();
}
}