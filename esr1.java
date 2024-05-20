import java.io.*;
public static <FilelnputStream> void main(String[]gs)throws Exception {
    FilelnputStream in= (FilelnputStream) new FileInputStream("d:/abc.txt");
int b=0;
while(true){
in.wait();
System.out.println(b);
}

}
