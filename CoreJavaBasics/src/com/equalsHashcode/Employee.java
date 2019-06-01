package com.equalsHashcode;

public class Employee {
	private Integer id;
	private String firstname;
	/*int d;
	 
	private void method1() {
		d=8;

	}*/
	/*public Employee() {
	d=8;
	}
	*/public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String lastName;
	private String department;

	public boolean equals(Object o) {
		
		System.out.println("In equals");
	    if(o == null)
	    {
	        return false;
	    }
	    if (o == this)
	    {
	        return true;
	    }
	    if (getClass() != o.getClass())
	    {
	        return false;
	    }
	     
	    Employee e = (Employee) o;
	    return (this.getId() == e.getId());
	}
	
	public int hashCode()
	{
		System.out.println("In hashcode..");
	    final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + getId();
	    return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "id =" + getId()+ "FirstName =" + getFirstname();
	}
	// Setters and Getters
}