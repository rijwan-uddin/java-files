//parent class
package parentchilddemo;


public class Employee {
 int id; //instance variable
 int salary;
 
  //constructor
 Employee(int i,int s){
 id=i;//local variable  //local varibale ke instance variable bujhaite chaile this.id
 salary=s;
 
 }
 
 void calculate_salary(){
     System.out.println(salary);
 }   
    
    
}
