package thread;

public class StartExp2  implements Runnable  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");  
        System.out.println(Thread.currentThread().getPriority()); 
       // System.out.println(Thread.currentThread().getName()); 
    }    
    public static void main(String args[])  
    {    
        StartExp2  m1=new StartExp2 ();    
        Thread t1 =new Thread(m1);    
        // this will call run() method  
        t1.start();    
    }    
}  