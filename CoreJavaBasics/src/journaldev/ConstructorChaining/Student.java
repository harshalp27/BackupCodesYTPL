package journaldev.ConstructorChaining;

public class Student extends Person {

	private String name;

	public Student() {
		System.out.println("Student Created");
	}

	public Student(int i, String n) {
		//super(i); // super class constructor called
		//this(); // error
	//	this();
		this.name = n;
		System.out.println("Student Created with name = " + n);
	}

}