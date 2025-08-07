import java.util.Scanner;
class Airline
{
    String pname;
    int bagwt;
    public Airline(String pname,int bagwt)
    {
        this.pname=pname;
        this.bagwt=bagwt;
    }
    public int calculateExcessFine()
    {
        int feelimit=20;
        if(bagwt<=feelimit)
        { 
            return 0;

        }
        return (bagwt-feelimit)*250;


    }
    public void printReceipt()
    {
        System.out.println("\n-----Baggae Slip-----");
        System.out.println("Enter passenger name:"+pname);
        System.out.printf("Enter bag weight:%d",bagwt);
        System.out.printf("\nFee for extra baggae:%d",calculateExcessFine());

    }

}
public class AirlineBaggageFeeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter passenger name:");
        String pname=s.nextLine();
        System.out.println("Enter bag weight:");
        int bagwt=s.nextInt();
        Airline air=new Airline(pname,bagwt);
        air.printReceipt();
        s.close();


        
    }
    
}
