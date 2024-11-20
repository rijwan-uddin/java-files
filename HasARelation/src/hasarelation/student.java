
package hasarelation;


public class student extends person{
    private int studentID;
    
   public void setInfoStudent(){
       System.out.println("studentId: ");
    studentID=sc.nextInt();
    setInfo();
    
   }
   void setInfoTaken(){
    System.out.println("course you will take:");
    course c=new course();
    c.setInfoCourse();
    stInfo();
    c.sstinfo();
   }
   
   public int getstudentID(){
   return studentID;
   }
   
}
