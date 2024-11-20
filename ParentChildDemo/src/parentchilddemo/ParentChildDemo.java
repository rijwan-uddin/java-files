/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchilddemo;

/**
 *
 * @author DELL
 */
public class ParentChildDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m1=new Manager(12,1000,"good");
        m1.calculate_salary();
        m1.showID();
    }
    
}
