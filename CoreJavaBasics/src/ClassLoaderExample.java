public class ClassLoaderExample  
{  
    public static void main(String[] args)  
    {  
        // Let's print the classloader name of current class.   
        //Application/System classloader will load this class  
    	ClassLoaderExample cle = new ClassLoaderExample();
        String c1=cle.getClass().getName();  
        Class c=ClassLoaderExample.class;  
        System.out.println("C1.."+c1);
        System.out.println("c.."+ c.getClassLoader());  
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());  
    }  
} 