package pack;

final class Student18 extends A {
	int rollno;
	String name;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone method" );
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			Student18 s1 = new Student18(101, "yash");

			Student18 s2 = (Student18) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println("s1..." + s1 );
			System.out.println(s2.rollno + " " + s2.name);
			System.out.println("s2.." + s2 );

		} catch (CloneNotSupportedException c) {
			System.out.println(c );
		}

	}
}
