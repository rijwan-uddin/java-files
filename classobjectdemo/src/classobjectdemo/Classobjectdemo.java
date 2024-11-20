
package classobjectdemo;



public class Classobjectdemo {
public static void main(String[] args) {
 student mina= new student("202-35","mina",3.5);
 student raju= new student("202-45","raju",4.5);
 student fahim= new student("202-55","fahim",4.6);
 
 
 /*mina.assignValue("202-35","mina",3.5);
 raju.assignValue("202-45","raju",4.5);
 fahim.assignValue("202-55","fahim",4.6);*/

 System.out.println(mina.id);
 System.out.println(mina.name);
 System.out.println(mina.cgpa);
 
 System.out.println(raju.id);
 System.out.println(raju.name);
 System.out.println(raju.cgpa);
 
 System.out.println(fahim.id);
 System.out.println(fahim.name);
 System.out.println(fahim.cgpa);
 
 mina.takeClearance();
 raju.takeClearance();
 fahim.takeClearance();
 
 
    }
    
}
