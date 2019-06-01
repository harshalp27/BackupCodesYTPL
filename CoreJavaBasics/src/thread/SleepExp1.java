package thread;

public class SleepExp1 extends Thread  
{    
	public void run()  
	{    
		for(int i=1;i<5;i++)  
		{    
			/*try  
			{  
				 Thread.sleep(500);
				 //Thread.sleep(500,9999999); throws java.lang.IllegalArgumentException: nanosecond timeout value out of range 
			}catch(InterruptedException e){System.out.println(e);} 
			*/
			System.out.println((Thread.currentThread())+" + " +i);
			//System.out.println(" + " +i);    
		}    
	}    
	public static void main(String args[])  
	{    
		SleepExp1 t1=new SleepExp1();    
		SleepExp1 t2=new SleepExp1();
		SleepExp1 t3=new SleepExp1();
		t1.start();   
		try {
			t1.join(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();  
		t3.start();  
	}    
}
