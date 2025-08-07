import java.util.Scanner;
class Admission
{
    String sname;
    int percentage;
    boolean testPassed;
    public Admission(String sname,int percentage,boolean testPassed)
    {
        this.sname=sname;
        this.percentage=percentage;
        this.testPassed=testPassed;
    }
    public boolean isEligible()
    {
        return percentage>=60&&testPassed;
    }
    public void details()
    {
        System.out.println("\n----Student Admission----");
        System.out.println("Enter student name:"+sname);
        System.out.println("Enter Percentage:"+percentage);
        System.out.println("Entrance test passed:"+(testPassed?"Yes":"No"));
        if (isEligible())
        {
            System.out.println("Result:Eligibile for admission");
        }
        else
        {
            System.out.println("Result: Not Eligibile for admission");

        }
        
    }

}
public class CollegeAdmissionSystem 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter student name:");
        String sname=s.nextLine();
        System.out.println("Enter student percentage:");
        int percentage=s.nextInt();
        s.nextLine();
        System.out.println("Did the student passed the test?(yes/no):");
        String tstatus=s.nextLine();
        boolean passed=tstatus.equalsIgnoreCase("Yes");
        Admission admission=new Admission(sname, percentage, passed);
        admission.details();
        s.close();


        
    }
    
}
