package FileHandlingAndExceptionHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        int i;
        try{
            FileReader r = new FileReader("D:FileOperationExample.txt");
            try{
                while ((i= r.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally {
                r.close();
            }
        }
        catch(IOException e){
            System.out.println("Exception Handling");
        }
    }
}