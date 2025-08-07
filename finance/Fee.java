package finance;

public class Fee 
{
    String studentId;
    double amountPaid;
    public Fee(String studentId,double  amountPaid)
    {
        this.studentId=studentId;
        this.amountPaid=amountPaid;
    }
    public void feeReceipt()
    {
        System.out.println("STUDENT ID :"+studentId);
        System.out.println("PAID AMOUNT :"+amountPaid);
    }
    
}
