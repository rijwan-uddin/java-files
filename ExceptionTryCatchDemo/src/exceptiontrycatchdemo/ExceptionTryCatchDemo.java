package exceptiontrycatchdemo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatchDemo {
public static void main(String[] args) {
  
    /*   Scanner sc = new Scanner(System.in);
        String num1, num2;
       try {
             num1 = sc.nextInt();
        } catch (Exception e) {
            
            System.out.println("Enter a number: ");
        }
        try {
             num2 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter a number: ");
        }
        
        System.out.println("Add = "+ (num1+num2));
        
        try {
            
            System.out.println("Sub = "+ (num1-num2));
            
        } catch (Exception e) {  // e is object
            
            System.out.println("Please enter a number: ");
        }
        try {
            System.out.println("Multi = "+ (num1*num2));
        } catch (Exception e) {
            System.out.println("Enter a number: ");
        }
        try {
            System.out.println("Div = "+ (num1/num2));
        } catch (Exception e) {
            System.out.println("Enter a number: ");
        }
        
        try {
            System.out.println("Mod = "+ (num1%num2));
        } catch (Exception e) {
            System.out.println("Enter a number: ");
        } */
       
       
      /* int a = Integer.parseInt("123");
        System.out.println("a");
        try {
            int b = Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("String type can't be converted into Integer");
        }
       String s1 = null;
        try {
            System.out.println("s1.length()");
        } catch (Exception e) {
            
            System.out.println("Null value has no length");
        } */
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr1[]= new int[s];
        try {
            int arr[]= new int[s];
            arr1=arr;
        }
         catch (NegativeArraySizeException e) {
                 System.out.println("Wrong input");
                 }
            try {
                arr1[100]= 23;
            } catch (NegativeArraySizeException e) {
                
                System.out.println("Error");
            }
        }
        
        
           
}
