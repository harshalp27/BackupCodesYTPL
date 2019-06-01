package thread;

public class StartExp1 extends Thread  
{    
    public void run()  
    {   
    	for (int i=0;i<5;i++){
    		
    	    System.out.println("Run " + Thread.currentThread().getPriority());
        System.out.println(i);
    	}
    }    
    public static void main(String args[])  
    {    
        StartExp1 t1=new StartExp1();    
        // this will call run() method
        System.out.println("Before setting" +t1.getPriority());
        t1.setPriority(5);
        System.out.println("After setting" +t1.getPriority());
        t1.start();
        
        t1.setPriority(10);
        System.out.println("After Start" +t1.getPriority());
       // t1.start();
        
    }    
}
