import java.util.Scanner;
class MobileRecharge
{
    private int  rechargeAmount;
    private int totalAmount;
    public MobileRecharge(int rechargeAmount)
    {
        this.rechargeAmount=rechargeAmount;
        this.totalAmount=calculateTotalWithGST(rechargeAmount);

    }
    private int calculateTotalWithGST(int amount)
    {
        int gst=amount*18/100;
        return amount+gst;
    }
    public void printReceipt()
    {
        System.out.println("-------Recharge Confirmation-----");
        System.out.printf("Recharge Amount:%.2f\n",rechargeAmount);
        System.out.printf("GST (18%%):%.2f\n",totalAmount-rechargeAmount);
        System.out.printf("Total Amount Deducted:%.2f\n",totalAmount);
        System.out.println("Recharge Successful! Thank You");
    }
}
public class RechargePortal
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the recharge amount:");
        int amount=scanner.nextInt();
        MobileRecharge recharge=new MobileRecharge(amount);
        recharge.printReceipt();
        scanner.close();
        
    }
}