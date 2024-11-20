
package homework1.pkg5;

import java.util.Scanner;
public class Homework15 {

 
    public static void main(String[] args) {
         

        Scanner input = new Scanner(System.in);

       

       double n,s,polygon;

       System.out.println("Enter any Number:");

       n = input.nextDouble();

       s = input.nextDouble();

       polygon = (n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n));

       System.out.println("Area of Polygon:"+polygon);

       
       
    }
    
}


