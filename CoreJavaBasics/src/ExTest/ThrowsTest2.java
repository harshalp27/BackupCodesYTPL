package ExTest;

import java.io.IOException;

//B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.

class M1{  
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	class Testthrows4{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M1 m=new M1();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	} 
