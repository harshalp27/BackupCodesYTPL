package cloneable;

class A  {
	// member attributes and methods
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone method");
		return super.clone();
	}
}

public class CloneTest {
	public static void main(String[] args) {
		try {
			A a = new A();
			A copied = (A) a.clone();
			System.out.println(a instanceof Cloneable);
			if (a instanceof Cloneable) {
				A copied1 = (A) a.clone(); // I should be able to do this; But I
											// am not.
			}
		} catch (CloneNotSupportedException c) {
			System.out.println(c);
		}
	}
}
