package com.collectionstest;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {
      Enumeration days;
      Vector dayNames = new Vector();
      
      
      dayNames.add("Thursday");
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Wednesday");
      dayNames.add("Tuesday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}
