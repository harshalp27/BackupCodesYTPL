import javax.management.RuntimeErrorException;

public class Test{  
  //defining fields  
	
 //creating main method inside the Student class  
 public static void main(String args[]){  
  //Creating an object or instance  
	 try{
		 Integer object = new Integer(10);
		 
		// 2. using static factory method
		Integer anotherObject = Integer.valueOf(10);
		 System.out.println(anotherObject.intValue());
		
		 Float f1 = new Float("3.0");
		 int a = f1.intValue();
		 Byte b = f1.byteValue();
		 int c = (Integer) null;
		// double d = 
				 
		// badMethod();
		 System.out.println(" ");
	 }
	 catch(Exception e){
		 System.out.println("b");
	 }
	 finally{
		 System.out.println("c");
	 }

	 System.out.println("d");
 }  
 public static void badMethod()
 {
	 throw new RuntimeException();
 }
}  