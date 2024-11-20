
package practice;

public class Qurbani {
    private String Name;
    private int Weight;
    private int price;
    Qurbani(String Name,int Weight, int price){
    this.Name=Name;
    this.Weight=Weight;
    this.price=price;
    }
    public void reducePrice(int price){
    this.price-=price;
            }
    
     public void increasePrice(int price){
     this.price+=price;
     }
    
   void printDetails(){
        System.out.println("Name:"+Name);
        System.out.println("Weight:"+Weight);
        System.out.println("price:"+price);
    }
    
}
