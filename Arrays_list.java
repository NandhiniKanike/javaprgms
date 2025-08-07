import java.util.Scanner;
import java.util.ArrayList;
public class Arrays_list 
{
    public static void main(String[] args) 
    {
        ArrayList<String> students=new ArrayList<>();
        Scanner s=new Scanner (System.in);
        int choice;
        do
        {
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.Display All Student");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice=s.nextInt();
            s.nextLine();
            switch(choice)
            {
                case 1:System.out.print("Enter student name to add");
                        String sname=s.nextLine();
                        students.add(sname);
                        break;
                case 2:System.out.print("Enter student name to be removed");
                        String rname=s.nextLine();
                        students.remove(rname);
                        break;
                case 3:System.out.print("Student List:"+students);
                        break;
                case 4:System.out.print("Exiting the program");
                        break;
                default:System.out.println("Invalid option!Please,enter valid option");
            }
        }while(choice!=4);
        s.close();
    }
}
