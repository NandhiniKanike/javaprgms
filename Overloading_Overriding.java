class BankAccount
{
    protected double balance;
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("DEPOSIED :" + amount);

    }
    void deposit(String amount )
    {
        double value=Double.parseDouble(amount);
        balance=balance+value;
        System.out.println("DEPOSITED IN THE FORM OF STRING : " + value);
    }
    void deposit(double amount1,double amount2)
    {
        balance=balance+(amount1+amount2);
        System.out.println("DEPOSITED TWO AMOUNTS : " + (amount1+amount2));

    }
    double calculateInterest()
    {
        return balance*0.05;
    }
    void showBalance()
    {
        System.out.println("BALANCE AMOUNT IS :" + balance);
    }
}
class SavingsAccount extends BankAccount
{
    double calculateInterest()
    {
        return balance*0.04;
    }
}
class CheckingAccount extends BankAccount
{
    double calculateInterest()
    {
        return balance*0.02;
    }
}
public class Overloading_Overriding
{
    public static void main(String[] args) 
    {
        BankAccount acc=new BankAccount();
        acc.deposit(1000);
        acc.deposit("500");
        acc.deposit(200,300);
        acc.showBalance();
        SavingsAccount savings=new SavingsAccount();
        savings.deposit(1000);
        System.out.println("Savings Interest: $" + savings.calculateInterest());
        CheckingAccount checking = new CheckingAccount();
        checking.deposit(1000);
        System.out.println("Checkin Interest: $" + savings.calculateInterest());



        
    }
}
