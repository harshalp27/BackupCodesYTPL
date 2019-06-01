package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
//	Resource resource=new ClassPathResource("applicationContext.xml");
// 	BeanFactory factory=new XmlBeanFactory(resource);
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
	Student student=(Student)context.getBean("studentbean");
	student.displayInfo();
	student.setName("Updated Value");
	student.displayInfo();
	Student student1=(Student)context.getBean("studentbean");
	student1.displayInfo();*/
	
/*To verify bean created on demand*/
	Student student1=(Student)context.getBean("studentbean1");
	System.out.println(student1);
	student1.displayInfo();
	Student student2=(Student)context.getBean("studentbean2");
	System.out.println(student2);
	student2.displayInfo();
	student1.displayInfo();
	/*Student studentss=(Student)context.getBean("studentbean");
	Student studentsss=(Student)context.getBean("studentbean");
	student.displayInfo();
	System.out.println("Without Object " +student);
	Object s1 = (Student)context.getBean("studentbean");
	System.out.println(s1);
	Object s2 = (Student)context.getBean("studentbean");
	System.out.println(s2);
	
	Student student1=(Student)context.getBean("studentbean1");
	student1.displayInfo();
	System.out.println("Without Object " +student1);
	Object s3 = (Student)context.getBean("studentbean1");
	System.out.println(s3);
	Object s4 = (Student)context.getBean("studentbean1");
	System.out.println(s4);*/
}
}
