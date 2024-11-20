
package mainclass;
import java.util.Scanner;

public class product {
  private String p_ID; 
  private String p_Name; 
  private String p_details;
  private double p_price; 
  private String p_expiredate;
  
  Scanner sc=new Scanner(System.in);
  
  public void setInfo()
  {
   System.out.println("product id: ");
   p_ID=sc.nextLine();
    System.out.println("product name: ");
    p_Name=sc.nextLine();
     System.out.println("product Details: ");
     p_details=sc.nextLine();
      System.out.println("product price: ");
      p_price=sc.nextDouble();
      System.out.println("product expiredate: ");
      p_expiredate=sc.nextLine();
      
}
  public String getp_ID(){
  return p_ID;
  }
  public String getp_Name(){
  return p_Name;
  }
  public String getp_details(){
  return p_details;
  }
  public double getp_price(){
  return p_price;
  }
  public String getp_expiredate(){
  return p_expiredate;
  }
  
}
