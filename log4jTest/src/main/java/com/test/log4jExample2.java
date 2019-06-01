package com.test;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.sql.SQLException;
import java.util.*;
import org.apache.log4j.Logger;

import com.test.log4jExample;

public class log4jExample2{

   /* Get actual class name to be printed on */
   public static void name1(Logger log1) throws IOException,SQLException{
	   System.out.println("Hello this is from method");
	   log1.debug("Hello this is from method");
	
}
}