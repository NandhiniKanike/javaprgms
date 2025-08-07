import java.util.Scanner;
class HospitalBill
{
    String pname;
    int days;
    String roomType;
    double totalbill;
    public HospitalBill(String pname,int days,String roomType)
    {
        this.pname=pname;
        this.days=days;
        this.roomType=roomType;
        this.totalbill=calculateBill();

    }
    double calculateBill()
    {
        double chargePerDay;
        switch(roomType.toLowerCase())
        {
            case "general":chargePerDay=1000;
                            break;
            case "private":chargePerDay=2000;
                            break;
            case "icu":chargePerDay=5000;
                            break;
           default:
                    System.out.println("Invalid room type! Defaulting to general");
                    chargePerDay=1000;
                    break;
        }
        return chargePerDay*days;
    }
    public void printInvoice() 
    {
        System.out.println("\n----- Hospital Billing Invoice -----");
        System.out.println("Patient Name: " + pname);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days Admitted: " + days);
        System.out.printf("Total Bill: %.2f\n", totalbill);
        System.out.println("Thank you for choosing our hospital.");
    }
}
public class HospitalBillingSystem 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of days admitted: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter room type (General/Private/ICU): ");
        String roomType = scanner.nextLine();

        // Create HospitalBill object
        HospitalBill bill = new HospitalBill(name, days, roomType);
        bill.printInvoice();

        scanner.close();
    }


    
}
