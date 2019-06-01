package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestAutowire  {
    public static void main(String[] args) {
 
        ApplicationContext context =
                  new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
           
        EmployeeBean employee = (EmployeeBean) context.getBean ("employee");
 
        System.out.println(employee.getFullName());
       
        System.out.println(employee.getDepartmentBean1().getName());
    }
}
