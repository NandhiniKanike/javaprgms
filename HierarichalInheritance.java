class Person
{
    String name;
    public Person(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println("NAME : "+ name);
    }

}
class Age extends Person
{
    int a;
    
    public Age(int a)
    {   
        super("Nandhini");
        this.a=a;

    }
    void show()
    {
        System.out.println("Age : " +a);
    }
    
}
class Place extends Person
{
    String p;

    public Place(String p)
    {
        super("Nandhini");
        this.p=p;

    }
    void print()
    {
        System.out.println("PLACE : " + p);
    }

}
class Country extends Person
{
    String c;
    public Country(String c)
    {
        super("Nandhini");
        this.c=c;

    }
    void showCountry()
    {
        System.out.println("COUNTRY : " + c);
    }


}
public class HierarichalInheritance 
{
    public static void main(String[] args) 
    {
        Age a1=new Age(21);
        a1.display();
        a1.show();
        Place p1=new Place("NGOS COLONY");
        p1.display();
        p1.print();
        Country c1=new Country("INDIA");
        c1.display();
        c1.showCountry();

        
    }
    
}
