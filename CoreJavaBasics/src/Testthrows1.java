import java.io.FileNotFoundException;
import java.io.IOException;  
public class Testthrows1{  
	 
	void p() throws ArithmeticException {  
		
	}  
	public static void main(String args[]) throws FileNotFoundException{  
		Testthrows1 obj=new Testthrows1();  
		obj.p();  
		System.out.println("normal flow...");  
	}  
}