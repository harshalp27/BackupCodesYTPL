package com.test;

public class Employee {
private int id;
private String name;
private String email;

public Employee() {System.out.println("def cons");}

/*public Employee(int id) {this.id = id;}

public Employee(String name) {	this.name = name;}

public Employee(int id, String name) {
	this.id = id;
	this.name = name;
}
*/
public Employee(String name) {
	this.name = name;
	
}
public Employee(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public void setName(String name){
	this.name = name;
}
void show(){
	System.out.println(id+" "+name);
	System.out.println(name);
	System.out.println(email);
}

void show1(){
	System.out.println(id+" "+name);
	//System.out.println(address);
	//System.out.println(address.getCountry());
}

}
