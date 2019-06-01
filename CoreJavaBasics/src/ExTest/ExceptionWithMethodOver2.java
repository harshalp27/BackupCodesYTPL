package ExTest;

// 1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception
import java.io.IOException;

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
}