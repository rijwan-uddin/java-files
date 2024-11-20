//202-35-653
package osalgorithm;
import java.util.*;
//FCFS
public class OsAlgorithm {

 
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter no of process: ");
int n = sc.nextInt();
int processid[] = new int[n];   
int arrival[] = new int[n];     
int brust[] = new int[n];     
int ct[] = new int[n];   
int ta[] = new int[n];     
int wt[] = new int[n];   
int temp;
float avaragewt=0,avarageTA=0;
 
for(int i = 0; i < n; i++)
{
System.out.println("enter process " + (i+1) + " arrival time: ");
arrival[i] = sc.nextInt();
System.out.println("enter process " + (i+1) + " brust time: ");
brust[i] = sc.nextInt();
processid[i] = i+1;
}
 

for(int i = 0 ; i <n; i++)
{
for(int  j=0;  j < n-(i+1) ; j++)
{
if( arrival[j] > arrival[j+1] )
{
temp = arrival[j];
arrival[j] = arrival[j+1];
arrival[j+1] = temp;
temp = brust[j];
brust[j] = brust[j+1];
brust[j+1] = temp;
temp = processid[j];
processid[j] = processid[j+1];
processid[j+1] = temp;
}
}
}

for(int  i = 0 ; i < n; i++)
{
if( i == 0)
{
ct[i] = arrival[i] + brust[i];
}
else
{
if( arrival[i] > ct[i-1])
{
ct[i] = arrival[i] + brust[i];
}
else
ct[i] = ct[i-1] + brust[i];
}
ta[i] = ct[i] - arrival[i] ;        
wt[i] = ta[i] - brust[i] ;          
avaragewt += wt[i] ;               
avarageTA += ta[i] ;            
}
        
System.out.println("\nproid  Arrival  Brust  Completion turnAround waiting");
for(int  i = 0 ; i< n;  i++)
{
System.out.println(processid[i] + "  \t " + arrival[i] + "\t" + brust[i] + "\t" + ct[i] + "\t\t" + ta[i] + "\t"  + wt[i] ) ;
}
sc.close();
System.out.println("\naverage waiting time: "+ (avaragewt/n));    
System.out.println("average turnAround time:"+(avarageTA/n));    
    }
    
}
