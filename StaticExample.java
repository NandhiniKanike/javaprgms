class Counter
{
    static int count = 0;
    Counter()
    {
        count++;
        System.out.println("Object Count :"+count);
    }
    static  void showCount()
    {
        System.out.println("Total Objects :"+count);
    }

}
public class StaticExample 
{
    public static void main(String[] args) 
    {
        Counter.showCount();
        
    }
    
}
