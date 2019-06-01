public class IIB extends B3{
	static int speed ;

	static{
		System.out.println("Static block IIB..."+ speed);
	}
	IIB() {
		speed =1;
		System.out.println("Constructor speed is " + speed);
	}
	
	IIB(int x) {
		System.out.println("prameterized Constructor speed is " + speed);
	}

	{
		System.out.println("speed is " + speed);
		speed = 100;
		System.out.println("After speed is " + speed);
	}

	public static void main(String args[]) {
		IIB b1 = new IIB();
		IIB b2 = new IIB();
		IIB b3 = new IIB(9);
	}
}