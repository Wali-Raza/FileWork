package Pack1;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
//        System.out.println("Wali Raza here");
//        File f=new File("abc.txt"); //this will not creat phiscal text file i
//        //itll creat a virtual file
//        System.out.println(f.exists());
//        f.createNewFile();
//        //NOew file will be created physically
//        System.out.println(f.exists());
//        File f1=new File("E:\\FileWork");
//        System.out.println(f1.exists());
//        File f=new File("Wali1");
//        f.mkdir();
//        String[] s=f.list();
//        System.out.println(f.length());
//        System.out.println(s);
//        System.out.println((f.mkdir()));
//        //System.out.println(f.exists());
//        File f1=new File("Wali1,Wali2.txt");
//        f.createNewFile();
//        //System.out.println(f.exists());

        int count=0;
        File f=new File("E:\\FileWork");
        String[] s=f.list();
        //long l=f.length();
        //System.out.println("Length="+l);
        for(String s1:s)
        {

            System.out.println(s1);
            count=count+1;

        }

        System.out.println("TOtal number of files="+count);
        
    }
}
