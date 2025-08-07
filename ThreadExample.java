// class ThreadExample extends Thread 
// {
//     public  void run()
//     {
//         System.out.println("Thread is running");
//     } 
//     public static void main(String[] args) 
//     {
//         ThreadExample t1= new ThreadExample();
//         t1.run();

//     }

// }
// class MyRunnable implements Runnable 
// {
//     public void run() 
//     {
//         System.out.println("Runnable thread is running");
//     }

//     public static void main(String[] args) 
//     {
//         Thread t1 = new Thread(new MyRunnable());
//         t1.start();
//         MyRunnable r1 = new MyRunnable();
//         r1.run();

//     }
// }
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread A :" +i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread B :" +i);
        }
    }
}
public class ThreadExample
{
    public static void main(String[] args) 
    {
        new A().start();
        new B().start();
        
    }
}

