package thread;

public class JavaInterruptExp2 extends Thread {
	 public void run()  
	    {    
	        for(int i=1; i<5; i++)  
	        {    
	            try  
	            {  
	                // thread to sleep for 500 milliseconds  
	            	Thread.sleep(500);  
	            	System.out.println("javatpoint");
	                   
	            }catch(InterruptedException e){System.out.println(e);}    
	            System.out.println("thread is running...");   
	        }    
	    } 
	    
			

	public static void main(String args[]) {
		JavaInterruptExp2 t1 = new JavaInterruptExp2();
		JavaInterruptExp2 t2 = new JavaInterruptExp2();
		// call run() method
		t1.start();
		// interrupt the thread
		t1.interrupt();
	}
}
