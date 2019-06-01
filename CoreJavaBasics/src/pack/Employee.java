package pack;


	public final class Employee{  
		static int pancardNumber; 
		//final static String x;
		/*static {
			x="4";
		}*/
		Employee(){  
			//pancardNumber = "4";
			
			}
		
		public Employee(String pancardNumber){  
		//this.pancardNumber=pancardNumber;
		
		} 
		
		
		  
		public int getPancardNumber(){  
			System.out.println("pancardNumber " +pancardNumber);
		return pancardNumber;  
		}  
public static void main(String[] args) {
	Employee e = new Employee();
	e.getPancardNumber();
	
}
		  
		}  

