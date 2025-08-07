class Book
{
    final String bookId;
    String title;
    public Book(String bookId,String title)
    {
        this.bookId=bookId;
        this.title=title;
    }
    final void printBookInfo()
    {
        System.out.println("Book ID :"+bookId);
         System.out.println("Book Title :"+title);

    }
}
final class ReferenceBook
{
    public void display()
    {
        System.out.println("this is a reference book");
    }
}
// class ExtendedReferenceBook extends ReferenceBook
// {
//     public void displayDetails()
//     {
//         System.out.println("Extending reference book");
//     }
// }
public class Library 
{
    public static void main(String[] args) 
    {
        Book book=new Book("101","Python");
        book.printBookInfo();
        ReferenceBook ref=new ReferenceBook();
        ref.display();
        
    }
    
}
