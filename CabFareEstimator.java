import java.util.Scanner;
class CarBooking
{
    String cname;
    String  cabType;
    int distance;
    int fare;
    public CarBooking(String cname,String cabType,int distance )
    {
        this .cname=cname;
        this.cabType=cabType;
        this.distance=distance;
        this .fare=calculateFare();


    }
    public int calculateFare()
    {
        int ratePerKm;
        switch(cabType.toLowerCase())
        {
            case "mini":ratePerKm=10;
                        break;
            case "sedan":ratePerKm=15;
                         break;
            case "suv":ratePerKm=20;
                        break;
            default:System.out.println("invalid selection of car type!Defaulting to mini");
                    ratePerKm=10;
        }
        return ratePerKm*distance;
    }
    public void printReceipt()
    {
        System.out.println("\n------Cab Fare Summary-------");
        System.out.println("Customer Name:"+cname);
        System.out.println("Cab Type:"+cabType);
        System.out.println("Distance:"+distance);
        System.out.println("Total Amount:"+fare); 
        System.out.println("---Thank you for booking---");

    }

}
public class CabFareEstimator 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter customer name:");
        String cname=s.nextLine();
        System.out.printf("Enter car type(mini/sedan/suv):");
        String cabType=s.nextLine();
        System.out.printf("Enter car distance:");
        int distance=s.nextInt();
        CarBooking car=new CarBooking(cname,cabType,distance);
        car.printReceipt();
        s.close();




        
    }
    
}
