class Animal{
    Animal()
    {
        System.out.println("Animal Constructor");
    }
    void sound()
    {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("Dog Constructor");

    }
    void dispaly()
    {
        super.sound();
    }
   
   

}
public class SuperExample 
{
    public static void main(String[] args) 
    {
        Dog d=new Dog();
        d.dispaly();
        
    }

    
}
