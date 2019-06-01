package ExTest;

class Excep6 {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 5;
				int c = Integer.parseInt("abc");
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			catch (IllegalArgumentException e) {
				System.out.println(e);
			}
			/*catch (NumberFormatException  e) {
				System.out.println(e);
			}*/
			

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			int x= 5/0;

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}
}
