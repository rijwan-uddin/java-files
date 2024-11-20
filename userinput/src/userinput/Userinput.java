//10-june User input

package userinput;
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 
       
  System.out.println("Enter int num:");
  int num1= sc.nextInt();
   System.out.println("print: " +num1);
   
   
   System.out.println("Enter decimal num:");
  double num2= sc.nextDouble();
   System.out.println("print: " +num2);
   
   
   System.out.println("Enter sen");
   String s1=sc.nextLine();
   String sen=sc.nextLine();
   System.out.println("print: " +sen);
   
     System.out.println("Enter a word " );
        String word =sc.nextLine();
        System.out.println("printing : " + word); 
    }
    
}
