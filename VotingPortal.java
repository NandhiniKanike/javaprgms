
import java.util.Scanner;
class NotEligibleException extends Exception
{
    public NotEligibleException(String message)
    {
        super(message);
    }
}
public class VotingPortal 
{
    public static  void  checkAge(int age) throws NotEligibleException
    {
        if(age<18)
        {
            throw new NotEligibleException("Not eligible for voting");

        }
        else
        {
            System.out.println("Eligible for voting!!");
        }
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =s.nextInt();
        try
        {
            checkAge(age);
        }
        catch(NotEligibleException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Log:User attempted with age :"+age);
        }
        s.close();

        
    }
}
    
