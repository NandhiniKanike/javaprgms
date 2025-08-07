interface Controllable
{
    void turnOn();
    void turnOff(); 
}
class Fan implements Controllable
{
    String location;
    public Fan(String location)
    {
        this.location=location;
    }
    public void turnOn()
    {
        System.out.println(location+"Fan is turned on");
    }
    public void turnOff()
    {
        System.out.println(location+"Fan is turned off");
    }
}
class Light implements Controllable
{
    String location;
    public Light(String location)
    {
        this.location=location;
    }
    public void turnOn()
    {
        System.out.println(location+"Light is turned on");
    }
    public void turnOff()
    {
        System.out.println(location+"Light  is turned on");
    }
}
public class SmartHomeSystem 
{
    public static void main(String[] args) 
    {
        Controllable livingRoomFan = new Fan("LivingRoom");
        Controllable kitchenLight = new Light("Kitchen");
        livingRoomFan.turnOn();
        livingRoomFan.turnOff();
        System.out.println();
        kitchenLight.turnOn();
        kitchenLight.turnOff();
       
    }
    
}
