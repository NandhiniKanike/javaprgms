import java.util.Scanner;
class Library
{
    String sname;
    String bookname;
    int delayedDates;
    public Library(String sname,String bookname,int delayedDates)
    {
        this.sname=sname;
        this.bookname=bookname;
        this.delayedDates=delayedDates;

    }
    int calculateFine()
    {
        if(delayedDates<=0)
        {
            return 0;

        }
        return delayedDates*5;
    }
    public void printReceipt()
    {
        System.out.println("\n-----Library Recepit-----");
        System.out.println("Enter student name:"+sname);
        System.out.println("Enter book name:"+bookname);
        System.out.println("Days Late:"+delayedDates);
        System.out.println("Fine amount:"+calculateFine());


    }

}    
public class LibraryFineCalculator 
{
    public static void main(String[] args)
    {
        
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter student name:");
    String sname=s.nextLine();
    System.out.println("Enter book name:");
    String bookname=s.nextLine();
    System.out.println("Enter no.of days delayed:");
    int delayedDates=s.nextInt();
    Library lib=new Library(sname,bookname,delayedDates);
    lib.printReceipt();
    s.close();
    }

    
}
