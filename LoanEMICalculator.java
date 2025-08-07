import java.util.Scanner;
class Emi
{
    String cname;
    int principal;
    int rate;
    int time;
    public Emi(String cname,int principal,int rate,int time)
    {
        this .cname=cname;
        this.principal=principal;
        this.rate=rate;
        this.time=time;

    }
    public int calculateInterest()
    {
        return (principal*time*rate)/100;
    }
    public int calculateTotalPayable()
    {
        return (principal+calculateInterest());
    }
    public int calculateEMI()
    {
        return (calculateTotalPayable()/(time*12));
    }
    public void printReceipt()
    {
        System.out.println("\n-----Loan EMI Schedule-----");
        System.out.println("Enter customer name:"+cname);
        System.out.printf("\nLoan amount:%d",principal);
        System.out.printf("\nRate of interest:%d",rate);
        System.out.printf("\nTime period:"+time+"years");
        System.out.printf("\nTotal payable:%d",calculateTotalPayable());
        System.out.printf("\nMonthly EMI:%d",calculateEMI());

    }


}
public class LoanEMICalculator 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter passenger name:");
        String cname=s.nextLine();
        System.out.println("Enter loan amount:");
        int principal=s.nextInt();
        System.out.println("Enter rate of interest :");
        int rate=s.nextInt();
        System.out.println("Enter time period:");
        int time=s.nextInt();
        Emi emi=new Emi(cname,principal,rate,time);
        emi.printReceipt();
        s.close();



        
    }
    
}
