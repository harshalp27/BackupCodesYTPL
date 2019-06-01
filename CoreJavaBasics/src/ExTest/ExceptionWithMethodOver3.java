package ExTest;

// 1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception
import java.io.IOException;

/*Example in case subclass overridden method declares parent exception
class Parent2 {
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends Parent2 {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}*/

/*Example in case subclass overridden method declares same exception
 * 
 * class Parent{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild3 extends Parent{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild3();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
} */

/*Example in case subclass overridden method declares subclass exception*/

class Parent3 {
	void msg() throws IOException {
		System.out.println("Super Msg method...!!!"
				+ "");
		throw new IOException("device error..!!!");
		//System.out.println("parent");
	}
}

class ExceptionWithMethodOver3 extends Parent3 {
	void msg() throws IOException {
		super.msg();
		System.out.println("child");
	}

	public static void main(String args[]) throws Exception {
		Parent3 p = new ExceptionWithMethodOver3();
		try {
			p.msg();
		} catch (Exception e) {
			System.out.println("handeled");
		}
		System.out.println("rest of the code..!!!");
	}
}
/*
 * Example in case subclass overridden method declares no exception class
 * Parent{ void msg()throws Exception{System.out.println("parent");} }
 * 
 * class TestExceptionChild5 extends Parent{ void
 * msg(){System.out.println("child");}
 * 
 * public static void main(String args[]){ Parent p=new TestExceptionChild5();
 * try{ p.msg(); }catch(Exception e){} } }
 */