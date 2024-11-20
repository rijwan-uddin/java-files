
package inheritance;


public class ManageInformation {
    public static void main(String[] args) {
        teacher teacher1= new teacher();
        teacher teacher2= new teacher();
         
        teacher1.id="17777122";
        teacher1.name="Mr Md Rasel";
        teacher1.department="SWE";
        teacher1.designation="lecturer";
        teacher1.displayInformation2();
        
        teacher2.id="177772";
        teacher2.name="Mr Ahmed";
        teacher2.department="SWE";
        teacher2.designation="lecturer";
        teacher2.displayInformation2();
        
        student student1= new student();
        student student2= new student();
        
        student1.id="202-35-653";
        student1.name="Md Sarker";
        student1.department="SWE";
        student1.batch="32";
        student1.displayInformation3();
        
        student2.id="202-35";
        student2.name="Md rakibul";
        student2.department="SWE";
        student2.batch="32";
        student2.displayInformation3();
    }
 
}
