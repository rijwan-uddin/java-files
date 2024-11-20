
package parentchilddemo;
public class Manager extends Employee {
 String performence;//sudhu manager class er jonno
 //constructor
 Manager(int i,int s,String p){
  super(i,s);
  performence=p;
 }
 void showID(){
     System.out.println(id);
 
 }//sudhu manager class er jonno
}
//child class of Employee