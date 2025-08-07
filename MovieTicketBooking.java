import java.util.Scanner;
class TicketBooking
{
    String user;
    String ticketType;
    int cost;
    int no_of_tickets;
    public TicketBooking(String user,String ticketType,int no_of_tickets)
    {
        this.user=user;
        this.ticketType=ticketType;
        this.no_of_tickets=no_of_tickets;
        this.cost=TicketCost();
    }
    public int TicketCost()
    {
        int pricePerTicket;
        switch(ticketType.toLowerCase())
        {
            case "regular":pricePerTicket=150;
                        break;
            case "premium":pricePerTicket=250;
                           break;
            default:System.out.println("invalid seat type!defaulting to regular");
                     pricePerTicket=150;
        }
        return pricePerTicket*no_of_tickets;

    }
    public void printReceipt()
    {
        System.out.println("\n----- Movie Ticket Receipt -----");
        System.out.println("Customer Name: " + user);
        System.out.println("Seat Type: " + ticketType);
        System.out.println("Tickets Booked: " + no_of_tickets);
        System.out.printf("Total Price: %d\n", cost);
        System.out.println("Enjoy your movie!");


    }
}
public class MovieTicketBooking 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the user name:");
        String user=s.nextLine();
        System.out.print("Enter seat type(Regular/Pramium):");
        String ticketType=s.nextLine();
        System.out.print("Enter no.of tickets:");
        int no_of_tickets=s.nextInt();
        TicketBooking booking=new TicketBooking(user,ticketType,no_of_tickets);
        booking.printReceipt();
        s.close();



        
    }
    
    
}
