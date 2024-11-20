
package hasarelation;
import java.util.Scanner;

public class person {
    public String name;
    public String email;
    public String mobile;
    Scanner sc=new Scanner(System.in);
    void setInfo(){
    
    System.out.println("Name:");
    name=sc.nextLine();
    System.out.println("email:");
    email=sc.nextLine();
    System.out.println("mobile:");
    mobile=sc.nextLine();
    }
    void stInfo()
{
    System.out.println("Name: "+name);
    System.out.println("carprice: "+email);
    System.out.println("cartype: "+mobile);
   
}
}
