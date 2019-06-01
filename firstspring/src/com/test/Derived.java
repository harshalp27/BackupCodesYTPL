package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class Base{
	
	public void add(){
		System.out.println("add.base");
	}
}

public class Derived extends Base {
	@Override
	public void add(){
		System.out.println("add.base");
	}
	public static void main(String[] args) {
		
	}
}
