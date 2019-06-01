package trycatch;

import java.io.IOException;

public class ExceptionTest {

	public ExceptionTest() throws Exception,RuntimeException {
		throw new Exception("not valid"); 
	}
	/*{
		int d=0;
		throw new RuntimeException("instance block..!!!");
	}*/
	public static void main(String[] args) {
		if(null == null){
			System.out.println("Null comparsion");
		}
		else{
			System.out.println("not null");
		}
		
		int i = 50;
		int j = 0;
		int data;
		try {
			ExceptionTest ex = new ExceptionTest();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			int a[]=new int[5];    
            a[10]=30/0 + (a[6]+1); 
			data = i / j; // may throw exception

			System.out.println("rest of the code");
		} 
		
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
//			System.exit(1);
			try{
			int data2=50/0;}
			catch(Exception w){
				System.out.println(w);
			}
			System.out.println(i / (j + 2));
			ExceptionTest.msg();
			System.out.println("In Catch Block End...!!!");
			// System.out.println(e.getStackTrace());
			// System.out.println(e.printStackTrace());
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		//	int data2=50/0;
			System.out.println(i / (j + 2));
			ExceptionTest.msg();
			System.out.println("In Catch Block End...!!!");
			// System.out.println(e.getStackTrace());
			// System.out.println(e.printStackTrace());
		}
		finally {
			System.out.println("In Finally Block starts...!!!");
			ExceptionTest.msg();
			System.out.println("In Finally Block ends...!!!");
			
			// System.out.println(e.printStackTrace());
		}
		System.out.println("Rest of the code Executed...!!!");

	}

	private static void msg() {
		System.out.println("Msg() method...!!!");
		return;
	}
}
