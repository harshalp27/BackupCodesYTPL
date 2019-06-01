package com.test;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.sql.SQLException;

public class Test1{

   /* Get actual class name to be printed on */
   private int x;
   private int y;
   
   
   public static void main(String[] args)throws IOException,SQLException{
	   Test1 t1 = new Test1();
	   t1.x = 6;
	   t1.y = 7;
	   
	   System.out.println(t1);
	   System.out.println(t1);
   }
}