/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo1;

import java.io.File;
import java.io.FileWriter;

public class FileDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
          File f = new File("test1.txt");
          FileWriter fw = new FileWriter(f);
          fw.write("This is java filee");
           fw.write("\r\n");
            fw.write(String.valueOf(23));
            fw.close();
      }
      catch (Exception e)
      {
          System.out.println("File not found");
      }
      
    }
    }
    
