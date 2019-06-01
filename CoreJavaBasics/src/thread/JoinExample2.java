package thread;

public class JoinExample2 extends Thread  
{    
	private String name;
	private String lastname;
	private int x;
	
	
  /*  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + x;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JoinExample2 other = (JoinExample2) obj;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		return true;
	}*/
	public void run()  
    {    
        for(int i=1; i<=5; i++)  
        {    
            try  
            {    
               // Thread.sleep(500);   
                System.out.println(Thread.currentThread().getName());
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads  
        JoinExample2 t1 = new JoinExample2();    
        JoinExample2 t2 = new JoinExample2();    
        JoinExample2 t3 = new JoinExample2();    
        // thread t1 starts  
        t1.start();
        t2.start();
        // starts second thread when first thread t1 is died.  
        try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);}    
        // start t2 and t3 thread   
       // t2.start();   
       // t3.start();    
    }    
}  
