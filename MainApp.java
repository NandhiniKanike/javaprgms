import academics.Course;
import finance.Fee;


public class MainApp 
{
    public static void main(String[] args) 
    {
        Course course=new Course("CS101","INTRODUCTION TO PYTHON PROGRAMMING");
        Fee fee=new  Fee("S1234",45000.0);
        System.out.println("===Academic Details ===");
        course.displayCourse();
        System.out.println("===Finance Details===");
        fee.feeReceipt();


        
    }
    
}
