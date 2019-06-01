
 abstract  class Bike1{
	 private int x;
	 static int y;
	 
	 static{
		
		 y=30;
	 }
		 Bike1(){
			 x=21;
			 System.out.println("x.."+ x + "y.."+y);
			 System.out.println("Constructor..");
		 }
		    abstract void run();
		  
		//abstract static void run1();
		/*{
			 System.out.println("static safely..");	 
 }*/
 }
		  class Honda4 extends Bike1{
		  void run(){
			  
			  System.out.println("running safely..");}
		//  static void run1(){System.out.println("static safely..");}

		  public static void main(String args[]){
			  
			  Bike1 obj = new Honda4();
		   obj.run();
		// obj.run1();
		  }
		  }


