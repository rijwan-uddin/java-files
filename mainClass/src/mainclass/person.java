
package mainclass;
import java.util.Scanner;
public class person {
  private String name;
   private String mobile;
   Scanner sc=new Scanner(System.in);
   

public void setInfo(){
    System.out.println("name:");
    name=sc.nextLine();
    System.out.println("mobile:");
    mobile=sc.nextLine();
}
}