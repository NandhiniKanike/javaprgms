class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }

}
public class ExceptionExample 
{
    static void checkAge(int age) throws MyException
    {
        if(age<18)
        {
            throw   new MyException("Not eligible to vote ");
        }
    }
    public static void main(String[] args) 
    {
        // try
        // {
        //     int a =10/0;
        // }
        // catch(ArithmeticException e )
        // {
        //     System.out.println(e);

        // }
        // finally
        // {
        //     System.out.println("Always executes(clean up code)");
        // }
        // try
        // {
        //     int[] arr=new int[5];
        //     arr[5]=10;

        // }
        // catch(ArithmeticException e )
        // {
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e )
        // {
        //     System.out.println(e);
        // }
        // catch(Exception e )
        // {
        //     System.out.println("General Exception ");
        // }
        // try
        // {
        //     try
        //     {
        //         int a=50/0;

        //     }
        //     catch(ArithmeticException e )
        //     {
        //         System.out.println(e);
        //     }
        // }
        // catch (Exception e )
        // {
        //     System.out.println("Outer block");
        // }
        
        try
        {
            checkAge(16);
        }
        catch(MyException e )
        {
            System.out.println(e);
        }

        

    }
    
}
