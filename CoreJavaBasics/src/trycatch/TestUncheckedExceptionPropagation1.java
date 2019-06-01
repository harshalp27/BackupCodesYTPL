package trycatch;

public class TestUncheckedExceptionPropagation1 {
	void m() {
		//throw new java.io.IOException("device error");
		int data = 50 / 0;
	}

	void n() {
		//try {
			m();
			//throw new ArithmeticException("Runtime..!!");
		/*} catch (Exception e) {
			System.out.println("Catch");
			e.printStackTrace();
		}*/
		/*
		 * int a[]= new int[10]; a[11]=11;
		 */
	}

	
	void p() {

		n();

	}

	public static void main(String args[]) {
		TestUncheckedExceptionPropagation1 obj = new TestUncheckedExceptionPropagation1();
		try {
			obj.p();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("normal flow...");
		}
	}
}
