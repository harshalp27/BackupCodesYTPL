
public class MainTest {

	int x, y;

	MainTest(int x, int y){
		this();
		this.x=x;
		this.y=y;
		
	}
	 MainTest() {
	
		x=5;
		y=10;
		
	}
	
	public void printMethod() {
		 int c;
		/*String newLine = System.getProperty("line.separator");
		int y= Integer.valueOf(newLine);
		*/System.out.println(y);
		System.out.println("X=" +x + "\n" + "Y=" + y);
	}
}
