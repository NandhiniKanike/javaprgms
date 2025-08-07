abstract class Payment
{
    String  transactionid;
    int amount;
    Payment(String transactionid ,int amount )
    {
        this.transactionid=transactionid;
        this.amount=amount;
    }
    abstract void  processPayment();
}
class UPIPayment extends Payment
{
    String upiId;
    UPIPayment(String transactionid,int amount,String upiId)
    {
        super(transactionid,amount);
        this.upiId=upiId;
    }
    void processPayment()
    {
        System.out.println("Processing UPI Payment ");
        System.out.println("Transactionid :"+transactionid);
        System.out.println("Amount :"+amount);
        System.out.println("UPIID :"+upiId);
    }
}
class CardPayment extends Payment
{
    String cardNumber;
    CardPayment(String transactionid,int amount,String cardNumber)
    {
        super(transactionid, amount);
        this.cardNumber=cardNumber;
    }
    void  processPayment()
    {
        System.out.println("Processing Card Payment ");
        System.out.println("Transactionid :"+transactionid);
        System.out.println("Amount :"+amount);
        System.out.println("CardNumber :"+cardNumber);


    }
}

public class PaymentDemo
{
    public static void main(String[] args) 
    {
        Payment[] payments=new Payment[2];
        payments[0]=new UPIPayment("TXN001", 1500, "user@upi");
        payments[1]=new CardPayment("TXN002", 3000, "1234-5678-9876-5432");
        for(Payment payment:payments)
        {
            payment.processPayment();
            System.out.println();
        }

        
    }
    
}
































