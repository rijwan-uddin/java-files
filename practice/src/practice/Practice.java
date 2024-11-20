
package practice;


public class Practice {

   
  public static void main(String[] args) {
  Qurbani q1=new Qurbani("Goat",10,10000);
  Qurbani q2=new Qurbani("Cow",60,50000);
  q1.reducePrice(800);
  q2.increasePrice(15000);
  q1.printDetails();
  q2.printDetails();
  } 
    }
    

