
public class A{ 
	static private int x;
	A(){  
		System.out.println("parent class constructor invoked");  
		} 
	static{
		System.out.println("Static block A...");
	}
	{
		System.out.println("speed is A" );
		
	}
		}  
		  
		class B3 extends A{  
			
		B3(){  
		super();  
		System.out.println("child class constructor invoked");  
		}
		
		
		static{
			System.out.println("Static block B...");
		}
		{
			System.out.println("speed is A" );
			
		}
		}
