package com.test;

public class Student {
private  String name;
private  String email;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
//private final String name1;
private Student (){
	System.out.println("Student Conatructor...");
}
private Student (String name){
	this.name = name;
	System.out.println("Student para Constructor...");
}
public String getName() {
	return name;
}

/*Student(String name){
	this.name = name;
}*/

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name + "Email is " + email);
}
}
