
package filereadandwrite;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FilereadandWrite {

    
    public static void main(String[] args) {
      try{
          File f = new File("test1.txt");
          FileWriter fw = new FileWriter(f);
          fw.write("This is db file");
          
           fw.write("\r\n");
            fw.write(String.valueOf(23));
              fw.write("\r\n");
            fw.close();
      }
      catch (Exception e)
      {
          System.out.println("File not found");
      }
      
      
      try{
          File f=new File("test1.txt");
          Scanner input=new Scanner(f);
          String num ="";
          while(input.hasNext())
           {
           num+=input.nextLine()+"\n";
           }
           System.out.println("num");
          }
         catch (Exception ex)
          {
          System.out.println("File not found");
            }
    
    
}
}