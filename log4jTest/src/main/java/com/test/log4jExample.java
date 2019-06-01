package com.test;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.sql.SQLException;
import java.util.*;
import org.apache.log4j.Logger;

public class log4jExample{

   /* Get actual class name to be printed on */
   public static Logger log = Logger.getLogger(log4jExample.class.getName());
   
   public static void main(String[] args) throws IOException,SQLException{
	   if(log.isTraceEnabled()){
		   log.trace("This is trace from enabled..: " );
		}
      log.debug("Hello this is a debug message");
      log.info("Hello this is an info message");
      log.trace("Hello this is an trace message");
      log4jExample2.name1(log);
   }
}