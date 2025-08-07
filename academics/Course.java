package academics;

public class Course 
{
    String courseId;
    String Cname;
    public Course(String courseId,String Cname)
    {
        this.courseId=courseId;
        this.Cname=Cname;

    }
    public void displayCourse()
    {
        System.out.println("COURSEID:"+courseId);
        System.out.println("COURSE NAME :"+Cname);
    }

    
}
