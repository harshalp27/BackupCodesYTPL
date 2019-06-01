
public abstract class Testabs2 extends Testabs {

	 static void method(){
		 System.out.println(3*2);
		 System.out.println(z);
		 
	 }
	 
	 public Testabs2() {
		 y=9;
		// z=10; //error
		}
	int x;
	final int y;
	final static int z;
	
	static{
		z=10;
	}
	
	public static void main(String[] args) {
		Testabs2.method();
	}

}
