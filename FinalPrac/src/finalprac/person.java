
package finalprac;
import java.util.Scanner;
public abstract class person {
    public String name;
    public String email;
    public String mobile;
    Scanner sc=new Scanner(System.in);
    abstract void INFO1();
    
    
    void infotake(){
    System.out.println("Name: ");
    name=sc.nextLine();
    System.out.println("email: ");
    email=sc.nextLine();
    System.out.println("mobile: ");
    mobile=sc.nextLine();
    
    
    }
    void printInfo(){
        System.out.println("name: "+name);
         System.out.println("email: "+email);
          System.out.println("mobile: "+mobile);
    }
    
    
    
}
