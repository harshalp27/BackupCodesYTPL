package thread;

public class JavaStopExp extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
               sleep(2500);  
                System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        JavaStopExp t1=new JavaStopExp ();    
        JavaStopExp t2=new JavaStopExp ();   
        JavaStopExp t3=new JavaStopExp ();   
        // call run() method   
        t1.start();  
        t2.start();  
        t3.start(); 
        
        // stop t3 thread   
        t3.stop();  
        System.out.println("Thread t3 is stopped");    
        //t3.start();  
        System.out.println("Thread t3 is again started");   
    }    
}
