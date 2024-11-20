
package mainclass;


public class salesman extends person{
    private String S_id;
    private double S_salary;
    private double bonus;
    
    public void setsalesmanInfo(){
    System.out.println("salesman id:");
    S_id=sc.nextLine();
        System.out.println("salary:");
        S_salary=sc.nextDouble();
        System.out.println("salesman bonus:");
        bonus=sc.nextDouble();
    }
    public double setbonusInfo(int percentage){
    bonus=bonus*percentage;
    return bonus;
    }
}
