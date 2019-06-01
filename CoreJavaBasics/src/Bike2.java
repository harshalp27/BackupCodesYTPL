
class Vehicle {
	// defining a method
	 public void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
public class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	public void run() {
		System.out.println("Bike is  safely");
	}

	public static void main(String args[]) {
		Vehicle obj = new Vehicle();// creating object
		obj.run();// calling method
	}
}
