package howdoinjava;

import java.util.Date;

class TestMain
{
    public static void main(String[] args)
    {
        ImmutableClass im = ImmutableClass.createNewInstance(100,"test", new Date());
        System.out.println(im);
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);
       /* String s1=new String("abc"); //1st line
        String s2="abc";                           //2nd line
        System.out.println(s1==s2);*/
        
       /* String s1=new String("abc"); //1st line
        s1=s1.intern(); //2nd line
        String s2="abc"; //3nd line
        System.out.println(s1==s2); // true
*/    
        String s1 = "abcd5";
        String s2 = "abcd"+"5";
        String s3 = "adcd"+s1.length();
        System.out.println("adcd"+s1.length());
        System.out.println("abcd"+"5");
        System.out.println(s1 == s2);//true
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s3);//false    
        
        Integer String = 10;
        
        System.out.println(String); 
    }
 
    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
        
    }
}
