abstract class Animal
{
    abstract void Sound();
    void Sleep()
    {
        System.out.println("Sleeping.....");
    }
}
class Dog extends Animal
{
    void Sound()
    {
        System.out.println("Barks...");
    }
}
public class AbstractExample 
{
    public static void main(String[] args) 
    {
        Animal a= new Dog();
        a.Sound();
        a.Sleep();
        
    }
    
}
// abstract class Vehicle
// {
//     int speed;
//      abstract void start();
//      void stop()
//     {
//         System.out.println("Vehicle is stopped");

//     }

// }
// class Car extends Vehicle
// {
//     void start()
//     {
//         System.out.println("Car starts with key");
//     }
// }
// class Bike extends Vehicle
// {
//     void start()
//     {
//         System.out.println("Bike starts with kick");
//     }
// }
// public class AbstractExample
// {
//     public static void main(String[] args) 
//     {
//         Car c=new Car();
//         c.start();
//         c.speed=100;
//         System.out.println("Car starts with speed of:"+c.speed);
//         c.stop();
//         Bike b=new Bike();
//         b.start();
//         b.speed=45;
//         System.out.println("Car starts with speed of:"+b.speed);
//         b.stop();
        
//     }
// } 
