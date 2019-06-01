 interface Printable1 {
	void print1();
	
}

interface Printable {
	 void print();
}

interface Showable extends Printable, Printable1 {
	void show();
}

class showable1 {
	void print2() {
		System.out.println("Hello2");
	}
}

public class TestInterface4 extends showable1 implements Printable1,Printable {
	public void print() {
		System.out.println("Hello");
	}

	public void print1() {
		System.out.println("Hello1");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.print1();
		obj.print2();
		//obj.show();
	}
}