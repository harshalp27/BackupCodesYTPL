package trycatch;

import java.io.IOException;

//A)In case you declare the exception, if exception does not occur, the code will be executed fine

class M{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	}  
	class Testthrows3{  
	   public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	} 
