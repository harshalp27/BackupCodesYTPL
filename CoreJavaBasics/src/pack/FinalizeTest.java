package pack;

public strictfp class FinalizeTest
{
   /**
 * @param args
 */
	strictfp static void calculateSpeed(){System.out.println("strictfp method...");}
public static void main(String[ ] args)         // A "main thread" gets introduced
   {
	   FinalizeTest t = new FinalizeTest( );                        // A Test object gets created
     // t.finalize( );                               // Finalize( ) method is called explicitly
      t = null;                                 // Test object becomes eligible for garbage collection
      System.gc( ); 
      // A request is made to JVM for running garbage collector ; A "gc thread" gets introduced
      System.out.println("End of main method");
      t.calculateSpeed();
   }
   public void finalize( )                         // Test class finalize( ) method
   {
      System.out.println("Finalize method called");
      System.out.println(10/0);
   }
}