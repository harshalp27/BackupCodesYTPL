public class A5 {
	
	
	void m() {
		System.out.println(this);// prints same reference ID
	}

	public static final void main(String args[]) {
		A5 obj = new A5();
		A5 obj1 = new A5();
		A a = new A();
	//	A.x=9;
		
		
		System.out.println("Obj" +obj);// prints the reference ID
		System.out.println("Obj1" +obj1);
		obj.m();
		obj1.m();
	}
}