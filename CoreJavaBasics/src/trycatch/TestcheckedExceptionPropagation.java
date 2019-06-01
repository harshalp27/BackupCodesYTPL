package trycatch;

import java.io.IOException;

public class TestcheckedExceptionPropagation {
	
		void m() throws Exception {
			throw new IOException("device error");// checked exception
		}

		void n() throws IOException {
			m();
		}

		void p() {
			try {
				n();
			} catch (Exception e) {
				System.out.println("exception handled");
			}
		}

		public static void main(String args[]) {
			TestcheckedExceptionPropagation obj = new TestcheckedExceptionPropagation();
			obj.p();
			System.out.println("normal flow...");
		}
	}
	/*
	 * public static void main(String args[]) { TestcheckedExceptionPropagation
	 * obj = new TestcheckedExceptionPropagation(); try { obj.p(); } catch
	 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * System.out.println("normal flow"); }
	 */