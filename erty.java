import java.io.*;
public class erty {
public static void main(String[]args){
    File src= null;
    if (args != null) {
        if (args[0] != null) {
            src = new File(args[0]);
        }
    }
    File des = null;
    if (args != null && args[1] != null) {
        des = new File(args[1]);
    }
    try{
copy(src,des);
        if (des != null) {
            System.out.println(des.length()+"字节已被复制,文件复");
        }
    }catch(IOException e){
System.out.println("文件复制失败!");
}
}
public static void copy(File src,File des)throws IOException {
    BufferedReader br= null;
    if (src != null) {
        br = new BufferedReader(new FileReader(src));
    }
    BufferedWriter bw= null;
    if (des != null) {
        bw = new BufferedWriter(new FileWriter(des));
    }
    String str;
    if (br != null) {
        while((str=br.readLine())!=null){
            assert bw != null;
            bw.write(str);
        bw.newLine();
        }
    }
    assert br != null;
    br.close( );
    assert bw != null;
    bw.close();
}


    }
