package pack;

import java.util.StringTokenizer;  
public class Simple{ 
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        //rev+=ch[i];  
	        rev = rev +ch[i];
	    }
	    System.out.println(rev);
	    return rev;  
	}  
 /**
 * @param args
 */
public static void main(String args[]){  
	Simple.reverseString("hello");
   StringTokenizer st = new StringTokenizer("my	/name/is/khan","/",true);  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
     
     
    /* while (st.hasMoreElements()) {  
    	 System.out.println("hasMoreElements");
         System.out.println(st.nextElement());  
     }*/  
   }  
}