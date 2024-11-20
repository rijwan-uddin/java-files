
package practiseeaception;

import java.util.Scanner;


public class Practiseeaception {

  
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
  int num1=0, num2=0;
 try{ 
     num1= sc.nextInt();  
 }       
 catch(InputMismatchException e){
     System.out.println("input was not an integer");
 }
 try{
    num2= sc.nextInt();    
 }
 catch (InputMismatchException){
     System.out.println("input was not an integer");
 }
          
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
  */
 }

}
  
 