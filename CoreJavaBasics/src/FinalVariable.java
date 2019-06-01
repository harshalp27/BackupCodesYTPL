
public class FinalVariable{  
	   final int data;//static blank final variable  
	   //static
	   { data=60;}  
	  /* FinalVariable(){
		   data=50;
	   }*/
	   /*FinalVariable(int x){
	      
		   data =100;
	   }*/
	   
	   public  void x(){
		  // data=60;
		   System.out.println("Method" + new FinalVariable().data);
	   }

	   public static void main(String args[]){  
	     System.out.println(new FinalVariable().data); 
	//     System.out.println(new FinalVariable(9).data); 
	  }  
	 }  
