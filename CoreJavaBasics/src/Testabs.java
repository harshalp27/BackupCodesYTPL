import java.lang.reflect.Method;

public abstract class Testabs {

	 static void method(){
		 System.out.println(3*2);
		 System.out.println(z);
		 
	 }
	abstract public void name();
	 
	 public Testabs() {
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
		Testabs.method();
	}

}
