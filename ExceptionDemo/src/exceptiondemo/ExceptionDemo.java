package exceptiondemo;
import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  int num1= sc.nextInt();        
  int num2= sc.nextInt();         
  System.out.println("Add:"+ (num1+num2));
  System.out.println("Div:"+ (num1/num2));
  System.out.println("Sub:"+ (num1-num2));
  System.out.println("Mlp:"+ (num1*num2));
  System.out.println("Mod:"+ (num1%num2));
  
  //if run time error than it calls exception
  //parentheses open and closing is a block problem
  //syntex error is run time error because this code is case sensitve.
   //handle exception:2 block uses-try and catch block

}
    
}
