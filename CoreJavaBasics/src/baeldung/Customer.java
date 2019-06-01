package baeldung;

public class Customer {
    private String firstName;
    private String lastName;
    public int x;
    // standard getters and setters. No toString() implementation
    
    @Override
    public String toString() {
    	System.out.println("Customer toString()");
        return "Customer [getFirstName()=" + getFirstName()
          + ", getLastName()=" + getLastName() + "]";
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
    
}
