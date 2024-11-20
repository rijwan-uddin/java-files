
package hasarelation;
import java.util.Scanner;
public class course {
    public String courseID;
    public String courseCODE;
    public String courseTITLE;
    Scanner sc=new Scanner(System.in);
    
    public void setInfoCourse(){
    System.out.println("courseid:");
    courseID=sc.nextLine();
    System.out.println("courseCODE:");
    courseCODE=sc.nextLine();
    System.out.println("courseTITLE:");
    courseTITLE=sc.nextLine();
    }
    void sstinfo(){
        System.out.println("courseID:"+courseID);
        System.out.println("courseCODE:"+courseCODE);
        System.out.println("courseTITLE:"+courseTITLE);
    }
    
}
