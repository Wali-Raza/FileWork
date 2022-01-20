package Pack1;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Wali Raza here");
        File f=new File("abc.txt"); //this will not creat phiscal text file i
        //itll creat a virtual file
        System.out.println(f.exists());
        f.createNewFile();
        //NOew file will be created physically
        System.out.println(f.exists());
        File f1=new File("E:\\FileWork");
        System.out.println(f1.exists());
        
    }
}
