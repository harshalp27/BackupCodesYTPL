package core.baeldung;

public class InterfaceTest extends Afinal	{

	private int height;
    private int width;
 
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getFileInfo() {
        return "Image File Impl";
    }
	
	public static void main(String[] args) {
		final Afinal a = new Afinal();
		Afinal a1 = new Afinal();
		//a1.height = 9; cannot be assigned
		System.out.println(a.getWeight());
		a.setWeight(1);
		System.out.println(a.getWeight());
		
		a.setWeight(3);
		System.out.println(a.getWeight());
		
		//a = a1; if we use final Afinal a = new Afinal(); compile time error 
		
		Afinal a2 = new Afinal();
		/*InterfaceTest a3= (InterfaceTest) a2; // throws classcastexception at runtime
		a3.getHeight();*/
		
		InterfaceTest a4;
		if (a2 instanceof InterfaceTest){
			System.out.println("In Instance of !!!");
			a4 = (InterfaceTest) a2;
			a4.getHeight();
		}
		
		System.out.println("Out of instance  !!!");
		
	}
	
}
