interface  Shape
{
    void draw();
}
class Circle implements Shape
{
    public void draw()
    {
        System.out.println("Draws circles ");
    }
}
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Shape s=new Circle();
        s.draw();
        
    }
    
     
}
// interface Chargeable
// {
//     void charge();
// }
// class Phone implements Chargeable
// {
//     public void charge()
//     {
//         System.out.println("Phone is charged through USB-C cable");

//     }
// }
// class Laptop implements Chargeable
// {
//     public void charge()
//     {
//         System.out.println("Laptop is charging via AC adapter");
//     }
// }
// public class InterfaceExample
// {
//     public static void main(String[] args) 
//     {
//         Phone p=new Phone();
//         p.charge();
//         Laptop l=new Laptop();
//         l.charge();
//     }
// }

