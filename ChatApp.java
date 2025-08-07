class ChatUser implements Runnable
{
    String uname;
    int delay;
    public ChatUser(String uname,int delay)
    {
        this.uname=uname;
        this.delay=delay;
    }
    public void run()
    {
        try 
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(Thread.currentThread().getName()+":"+uname+"says :Message"+i);
                Thread.sleep(delay);
            }
            
        } catch (InterruptedException e )  
        {
            System.out.println(uname+"was interrupted");

            
        }
    }
}
public class ChatApp 
{
    public static void main(String[] args) 
    {
        ChatUser user1=new ChatUser("Nandhini", 1000);
        ChatUser user2=new ChatUser("abc", 2000);
        ChatUser user3=new ChatUser("xyz", 1500);
        Thread t1=new Thread(user1,"Thread-A");
        Thread t2=new Thread(user2,"Thread-B");
        Thread t3=new Thread(user3,"Thread-C");
        t1.setPriority(Thread.MAX_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MIN_PRIORITY); 
        t1.start();
        t2.start();
        t3.start();



        
    }
    
}
