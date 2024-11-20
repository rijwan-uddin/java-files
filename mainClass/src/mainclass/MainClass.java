
package mainclass;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        int number,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many product and customer you want to add: ");
        number= sc.nextInt();
        product p[]=new product[number];
        customer c[]=new customer[number];
        
        
        for(i=0;i<number;i++){
        c[i]=new customer();
        c[i].setInfo2(); 
        }
        for(i=0;i<number;i++){
        p[i]=new product();
        p[i].setInfo();
        }
        
        System.out.println("Customer Details: ");
        for(i=0;i<number;i++){
         System.out.println(c[i].cName());
         System.out.println(c[i].cphone());
         System.out.println(c[i].CID());
         System.out.println(c[i].CAddress());
            
        
        }
        System.out.println("product Details: ");
        for(i=0;i<number;i++){
         System.out.println(p[i].getp_ID());
         System.out.println(p[i].getp_Name());
         System.out.println(p[i].getp_details());
         System.out.println(p[i].getp_price());
         System.out.println(p[i].getp_expiredate());
        
        }
        
    }
    
}
