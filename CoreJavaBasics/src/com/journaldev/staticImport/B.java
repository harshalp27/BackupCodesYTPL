package com.journaldev.staticImport;

import static com.journaldev.staticImport.A.*;

public class B  extends A{

	
B(){
	
}
	B(int x){
		
	}
	public static void main(String args[]){
		B b = new B();
		System.out.println(MAX); //normally A.MAX
		foo(); // normally A.foo()
	}
}
