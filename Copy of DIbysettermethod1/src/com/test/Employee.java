package com.test;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
private int id1;
private String name1;
private String city;



public int getId1() {
	return id1;
}



public void setId1(int id1) {
	this.id1 = id1;
}



public String getName1() {
	return name1;
}



public void setName(String name1) {
	this.name1 = name1;
}



public String getCity() {
	return city;
}


@Required
public void setCity(String city) {
	this.city = city;
}



void display(){
	System.out.println(id1+" "+name1+" "+city);
}

}
