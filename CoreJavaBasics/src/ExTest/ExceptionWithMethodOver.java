package ExTest;

/*
 * If the superclass method does not declare an exception
	--->If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
	If the superclass method declares an exception
	--->If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
*/import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent {
	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}