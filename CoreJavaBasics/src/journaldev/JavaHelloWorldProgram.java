package journaldev;

public class JavaHelloWorldProgram {

	
	static public  void main(String args[]){
		JavaHelloWorldProgram obj = new JavaHelloWorldProgram();
		System.out.println("Calling method..");
		obj.JavaHelloWorldProgram();
		System.out.println("Hello World");
		int x = obj.JavaHelloWorldProgram1();
		System.out.println("x = " + x);
	}
	
	public JavaHelloWorldProgram(){
		System.out.println("Constructor..");
		
	}
	
public void JavaHelloWorldProgram() {
	System.out.println("JavaHelloWorldProgram");
	return ;
}

public int JavaHelloWorldProgram1() {
	System.out.println("JavaHelloWorldProgram");
	return 1;
}
	
// errors in below methods as they are same
/*public void print(String s) {}
private static int print(String s) {}*/


public void print(String s, int i) {}
private static void print(int i, String s) {}


}

