
package mainclass;
import java.util.Scanner;

public class customer extends person {
  private String C_ID;
  private String name; 
  private String mobile;
  
  private String address;
  private String C_type;
  
  Scanner sc=new Scanner(System.in); 
  
  public void setInfo2(){
      System.out.println("Customer ID:");
        C_ID=sc.nextLine();
        setInfo();
        System.out.println("CUstomer Address:");
       address=sc.nextLine();
      
      System.out.println("Customer type:");
      C_type=sc.nextLine();
      
    
  
  }
 public void setC_type(String c_type){C_type=c_type;}
 public String getC_id(){return C_ID;}
 public String getName(){return name;}
 public String getMobile(){return mobile;}
 public String getAddress(){return address;}
}
   