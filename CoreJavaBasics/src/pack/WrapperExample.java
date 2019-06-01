package pack;

public class WrapperExample {
	public static void main(String args[]) {
		// Converting int into Integer
		int a = 20;
		double mul(){
			
		}
		Integer i = Integer.valueOf(a);// converting int into Integer
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a)
						// internally

		System.out.println(a + " " + i + " " + j);
		
		Integer x = new Integer(30);
		System.out.println(x.intValue());
		
		System.out.println("args"+args.length);
		System.out.println("args"+args[0]+args[1]);
		String h = String.valueOf(args[1]);
		System.out.println(h);
	}
}