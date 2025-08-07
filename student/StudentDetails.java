package student;

public class StudentDetails 
{
    String sname;
    int sid;
    public StudentDetails(String sname,int sid)
    {
        this.sname=sname;
        this.sid=sid;
    }
    public void printStudentDetails()
    {
        System.out.println("Student Name:"+sname);
        System.out.println("Student ID:"+sid);
    }
    
}
