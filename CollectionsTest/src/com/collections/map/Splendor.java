package com.collections.map;
 
	class Bike{  
		  void run(){System.out.println("running");}  
	}  
public 	class Splendor extends Bike{ 
	public static void main(String[] args) {

	  try{  
          int a = 1;   
          System.out.println(a/0);  
      }  
	  catch(Throwable e){System.out.println(e);}  
	    //catch(ArithmeticException ex){System.out.println(ex);}   
      finally  
      {  
          System.out.println("rest of the code...");  
      }   
	  System.out.println("Hello....");
	}  
}