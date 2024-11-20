package trycatchdemo;
import java.util.Scanner;
public class TryCatchdemo {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); 
  
  int num1= sc.nextInt();        
  int num2= sc.nextInt();         
  System.out.println("Add:"+ (num1+num2));
  try{
   System.out.println("Div:"+ (num1/num2));   
  }
  catch(ArithmeticException e) {
      System.out.println("CAN NOT DIVIDED BY ZERO");   
  }
  System.out.println("Sub:"+ (num1-num2));
  System.out.println("Mlp:"+ (num1*num2));
  try{
   System.out.println("Mod:"+ (num1%num2));   
  }
  catch(ArithmeticException R){
      System.out.println("cannot mod by 0");
  }
 }

}     
 
  
  //if run time error than it calls exception
  //parentheses open and closing is a block problem
  //syntex error is run time error because this code is case sensitve.
   //handle exception:2 block uses-try and catch block


    

 
    
    
    
    
    
  
