package Lesson_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class lesson_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try{
            File file = new File("newFile.txt");

            if(!file.exists());
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);  
            pw.println("Откуда готовилось нападение?");  
            pw.println("Вам показать?");  
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
                
        } catch(IOException e) {
            System.out.print("Error: " + e);
        } finally {
            try{
                br.close();
            } catch(IOException e) {
                System.out.print("Error: " + e);
            }
        }
    }
}