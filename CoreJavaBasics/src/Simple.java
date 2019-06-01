public class Simple {
	public static void main(String[] args) {
		byte a = 100;
		byte b = 100;
		int g = 12;
		byte h = 3;
		int j = g + h;
		int x = 345666;
		int y = 985764556;
		try {
			// byte c=a+b;
			int z = x + y;
			System.out.println(5 + 3 - 1 * 4 / 2);
			System.out.println(10 << 2);// 10*2^2=10*4=40
			System.out.println(10 << 3);// 10*2^3=10*8=80
			System.out.println(20 << 2);// 20*2^2=20*4=80
			System.out.println(15 << 4);// 15*2^4=15*16=240
			// byte c=a+b;
			// System.out.println(c);
			String s1 = "Javatpoint";
			String s2 = s1.intern();
			String s3 = new String("Javatpoint");
			String s4 = s3.intern();
			System.out.println(s1 == s2); // True
			System.out.println(s1 == s3); // False
			System.out.println(s1 == s4); // True
			System.out.println(s2 == s3); // False
			System.out.println(s2 == s4); // True
			System.out.println(s3 == s4); // False

			String s = "200";
			// Converting String into int using Integer.parseInt()
			int i = Integer.parseInt(s);
			System.out.println(200 + 100 + 200 + 100 + s);// 200100, because
															// "200"+100, here +
															// is a string
															// concatenation
															// operator
			System.out.println(i + 100);
		} 
		catch (NumberFormatException e) {
			
			System.out.println(e);// Compile Time Error: because a+b=20 will be
									// int
		}catch (Exception e) {
			System.out.println(e);// Compile Time Error: because a+b=20 will be
									// int
		}
		// byte c=(byte)(a+b);

	}
}