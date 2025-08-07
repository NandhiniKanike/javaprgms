/*class Student
{
    String name;
    int age;
    void display()
    {
        System.out.println("Name :"+name+",Age:"+age);
    }
}*/
class Car
{
    String model;
    Car(String m)
    {
        model=m;
    }
    void display()
    {
        System.out.println("Model of the car is :"+model);
    }

}
public class Main
{
    public static void main(String[] args) 
    {
        /*Student s1=new Student();
        s1.name="Nandhini";
        s1.age=21;
        s1.display();*/
        Car c=new Car("Benz");
        c.display();

        
    }
}
