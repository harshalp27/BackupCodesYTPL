class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);  
  }  
  Bike10(int x){  
	  speedlimit=90;  
	  System.out.println("Default Constructor");  
	  }  
	  
  
  public static void main(String args[]){  
	  
    new Bike10();  
    new Bike10(10);
 }  
}  