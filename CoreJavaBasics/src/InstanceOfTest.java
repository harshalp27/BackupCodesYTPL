
public class InstanceOfTest {  
	 public static void main(String args[]){  
		 InstanceOfTest s=new InstanceOfTest();  
		 System.out.println("Object" + s instanceof String);//true  
		 Object o = new Object();
		 // System.out.println(o instanceof Cloneable);
		  System.out.println(o instanceof java.lang.ArrayIndexOutOfBoundsException);
		  InstanceOfTest d=null;  
		  System.out.println(d instanceof InstanceOfTest);//false
		  
		 }  
		}