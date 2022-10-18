package test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class test {
    public static void main(String[] args) {
        try{
            File f = new File("test.txt");

            if(!f.exists())
            f.createNewFile();
            System.out.println(f.getAbsolutePath());
            System.out.println(f.lastModified());

            PrintWriter pw = new PrintWriter(f);
            pw.println("Тестирую работу с файлами");
            pw.close();
        } catch(IOException e) {
            System.out.println("error" + e);
        }
    }
}
