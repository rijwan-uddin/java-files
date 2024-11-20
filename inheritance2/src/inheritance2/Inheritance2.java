
package inheritance2;


public class Inheritance2 {

  
    public static void main(String[] args) {
      
       salesman s1=new salesman();
       s1.salesmanname="farin";
       s1.salesmanid="2222";
     
       s1.Carname="toyota";
       s1.carmodel="mark2";
       s1.carNumber=22222;
       s1.showinfosalesman();
       
       salesman s2=new salesman();
       s2.Carname="tt";
       s2.showinfosalesman();
    }
    
}
