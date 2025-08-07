import java.util.Scanner;
class TaxPayer
{
    String ename;
    int salary;
    int tax;
    public TaxPayer(String ename,int salary)
    {
        this.ename=ename;
        this.salary=salary;
        this.tax=calculateTax();

    }
    public int calculateTax()
    {
        int tax=0;
        if(salary<=250000)
        {
            tax=0;
        }
        else if(salary<=500000)
        {
            tax=(salary-250000)*5/100;
        }
        else if(salary<=1000000)
        {
            tax=(250000*5/100)+(salary-500000)*20/100;
        }
        else
        {
            tax=(250000 * 5/100) + (500000 * 20/100) + (salary - 1000000) * 30/100;

        }
        return tax;
       


    }
    public void TaxSummary()
    {
        int tax = calculateTax();
        System.out.println("\n----- Income Tax Summary -----");
        System.out.println("Name: " + ename);
        System.out.printf("Annual Salary: %d\n", salary);
        System.out.printf("Income Tax Payable: %d\n", tax);


    }
    

}
public class IncomeTaxEstimator 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter employee name:");
        String ename=s.nextLine();
        System.out.println("Enter salary:");
        int salary=s.nextInt();
        TaxPayer t=new TaxPayer(ename,salary);
        t.TaxSummary();
        s.close();

        
    }
    
}
