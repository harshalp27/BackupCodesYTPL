package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
/*Constructor Injection*/
public class Test {
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Employee s=(Employee)factory.getBean("e");
		s.show();
		
		/*System.out.println("Printing values from second bean...!!!!");
		Employee s1=(Employee)factory.getBean("e1");
		s1.show1();
		s1.setName("Harshal");
		System.out.println(s1);
		System.out.println(s);
		s.show();*/
		
	}
}
