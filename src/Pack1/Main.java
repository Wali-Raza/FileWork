package Pack1;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException
    {
        File f=new File("abc2.txt");
        FileWriter  fw=new FileWriter(f);
        fw.write("walimanzoor321@gmail.com");
        fw.write("\nalikkcs42@gmail.com");
        fw.flush();
        fw.close();
        FileReader fr=new FileReader(f);
        //char[] ch=new char[(int)f.length()];
        System.out.println(f.length());
        int  i=fr.read();
        while (i!=-1)
        {
            System.out.print((char) i);
            i=fr.read();
        }
        fr.close();
    }
}
