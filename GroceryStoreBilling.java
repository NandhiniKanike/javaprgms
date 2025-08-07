import java.util.Scanner;
import java.util.ArrayList;
class Item
{
    String name;
    int price;
    int quantity;
    public Item(String name,int price,int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public int getTotal()
    {
        return price*quantity;
    }
}
class GroceryBill
{
    private String cname;
    private ArrayList<Item>items;
    public GroceryBill(String cname)
    {
        this.cname=cname;
        this.items=new ArrayList<>();
    }
    public void addItem(String name,int price,int quantity)
    {
        Item item=new Item(name,price,quantity);
        items.add(item);
    }
    public int calculateTotalBill()
    {
        int total=0;
        for(Item item:items)
        {
            total=total+item.getTotal();
        }
        return total;
    }
    public void printBill() 
    {
        System.out.println("\n----- Grocery Store Bill -----");
        System.out.println("Customer Name: " + cname);
        System.out.println("---------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Price", "Qty", "Total");
        System.out.println("---------------------------------");
        for (Item item : items) 
        {
            System.out.printf("%-15s %-9d %-10d %-10d\n", item.name, item.price, item.quantity, item.getTotal());
        }
        System.out.println("---------------------------------");
        System.out.printf("Total Amount: %d\n", calculateTotalBill());
        System.out.println("Thank you for shopping with us!");
    }




}


public class GroceryStoreBilling 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER CUSTOMER NAME:");
        String cname=s.nextLine();
        GroceryBill bill=new GroceryBill(cname);
        System.out.print("Enter number of items (3–5): ");
        int items = s.nextInt();
        s.nextLine(); 
        for (int i = 1; i <= items; i++) {
            System.out.println("\nEnter details for item " + i + ":");
            System.out.print("Item name: ");
            String itemName = s.nextLine();
            System.out.print("Price: ₹");
            int price = s.nextInt();
            System.out.print("Quantity: ");
            int quantity = s.nextInt();
            s.nextLine(); // consume newline

            bill.addItem(itemName, price, quantity);
        }

        bill.printBill();

        s.close();





        
    }
    
}
