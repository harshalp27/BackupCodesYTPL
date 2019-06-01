package pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Test";
      /*  s1= "Test2";
        System.out.println("New referecne " +s1);
      */  String s2 = "Test";
        String s21 = new String("Test");
        String s22 = new String(s1);
        String s23 = new String("Test");
        String s24 = new String(s23);
        System.out.println("comparing references using literal(s1==s2)");
        System.out.println(s1==s2);
        System.out.println("(s1==s2)" + (s1.equals(s2)));
        System.out.print("compare literal and New ..!!! ");
        System.out.println(s1==s21);
        System.out.print("compare literal and New using constructor..!!! ");
        System.out.println(s1==s22);
        System.out.print("compare new and New ..!!! ");
        System.out.println(s21==s23);
        System.out.print("compare new and New using constructor..!!! ");
        System.out.println(s23==s24);
        
        String s25 = null;
        System.out.println(s2.equals(s25));
        
        String author = "adthor";
        String book = "abook";
        String duplicateBook = "book";
        
        System.out.println(author.compareTo(book));
        System.out.println(book.compareTo(author));
        System.out.println(duplicateBook.compareTo(book));
        
        String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung1");
        System.out.print("compare constantString and newString..!!! ");
        System.out.println(constantString==newString);
         
        String internedString = newString.intern();
        System.out.print("compare constantString and internedString..!!! ");
        System.out.println(constantString==internedString);
        
        String name = "baeldung";
        name.replace("dung", "----");
        System.out.println(name.replace("dung", "----"));
        System.out.print("Replace method..!!! ");
        System.out.println(name);
       
        final List<String> strings = new ArrayList<>();
        List<String> strings1 = new ArrayList<>();
        strings1 = strings;
        System.out.println("Original size " + strings.size());
        strings.add("baeldung");
        System.out.println("After Modification" + strings.size());
        
       // HashMap<String, String> strings = new HashMap();
        
        String s3 = new String("TestTest");
        System.out.println(s3.substring(1,5));
        String s4 = s3.intern();
        System.out.println(s3.indexOf('e',2));
        int x=10;
        String y = String.valueOf(x);
        System.out.println(y);
        System.out.println(s4);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        
        String s5="Sachin";  
        String s6="SACHIN";  
       
       System.out.println(s5.equals(s6));//false  
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s5.length());//true  
        
        String s="Sachin"+" Tendulkar";  
        
        System.out.println(s);//Sachin Tendulkar 
        String s7="Sachin";  
        String s8="Tendulkar";  
        String s9=s8.concat(" "+s7);
                
        System.out.println(s9);
        System.out.println(s8);
        
        StringBuffer s10= new StringBuffer("Sachin");
        StringBuffer s11= new StringBuffer("Tendulkar");
         
        StringBuffer sb = s10.append(s11);
        System.out.println(s10);
        System.out.println(s11.insert(0, "hfaufhuahnnmnmnnknvnjkfndjvnfjvhdjfnvmk"));
        System.out.println(s11.capacity());
        
        StringBuilder s12= new StringBuilder("Sachin");
        StringBuilder s13= new StringBuilder("Tendulkar");
        System.out.println("s13...!!!" +s13);
        String s19 = new String(s13);
        System.out.println("Constructor...!!!" + s13);
         
        StringBuilder sb1 = s12.append(s13);
        System.out.println(s12);
        
        StringBuffer sb11=new StringBuffer();  
        System.out.println(sb11.capacity());//default 16  
        sb11.append("Hello");  
        System.out.println(sb11.capacity());//now 16  
        sb11.append("java is my favourite language"); 
        System.out.println("s12==s13"+(s12==s13));
        System.out.println(sb11.reverse().toString());
        System.out.println(sb11.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
    }
}