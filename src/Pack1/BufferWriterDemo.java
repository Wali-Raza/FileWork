package Pack1;
import java.io.*;

public class BufferWriterDemo
{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("abc3.txt"));
        bw.write("walimanzoor321@gmail.com");
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
