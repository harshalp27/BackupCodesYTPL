
public class RecursiveConstructor 
{  
	RecursiveConstructor(){
		this(9);
		System.out.println("hello a");

	}  
	RecursiveConstructor(int x){  
		this();  
		System.out.println(x);  
	}  
}  
class TestThis5{  
	public static void main(String args[]){  
		RecursiveConstructor a=new RecursiveConstructor(10);  
	}
}

