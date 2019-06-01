package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringExample {
	public static void main(String args[]) {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		CharSequence ch1 = "hello";
		String s = "strings";
		String s2 = new String(ch);// converting char array to string
		String s4 = new String("abfjafajkfcmnmfjsdhjfalfj");
		String s3 = new String("example");// creating java string by new keyword
		String s35 = new String("ja");
		System.out.println("Contains...!!!");
		System.out.println(s4.contains(s35));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// String Methods
		System.out.println(s2.substring(2));
		System.out.println(s2.contains(ch1));
		System.out.println(s2.equals(ch1));
		System.out.println(s4.equals(s));
		System.out.println(s4 == s);

		System.out.println(s4.equalsIgnoreCase(s));
		System.out.println(s4.replace('S', 'X'));

		String s5 = new String("abfjafa/jkfcmnmf/jsdhjfalfj ");
		String s56;
		String[] s6 = s5.split("/", 0);
		System.out.println(s5);
		System.out.println(s6.length);
		for (String temp : s6) {
			System.out.println("Splittedt" + temp);
		}
		String s57 = "";
		String[] s57c = s57.split(",");
		System.out.println("toString " + Arrays.toString(s57c));
		System.out.println(s57c.length);
		for (String temp : s57c) {
			System.out.println("s57c" + temp);
		}

		String s8 = new String(" abf afajk fcm nmfjs dhjfa  lfj ");
		System.out.println(s8.length());
		System.out.println(s8.trim());
		System.out.println(s8.trim().length());

		StringJoiner joiner = new StringJoiner("and ", "starts ", "ends ");
		joiner.add("Red").add("Green").add("Blue");

		System.out.println(joiner);

		String s31 = "Baeldung";
		String s32 = new String("Baeldung");
		String s33 = new String("Baeldung").intern();
		System.out.println("intern compare......!!!");
		System.out.println(s31 == s33);

		String abcd = "bdCa";
		char[] chars = abcd.toCharArray();

		Arrays.sort(chars);
		String sorted = new String(chars);

		System.out.println(sorted);

		String countries = "Russia,Germany,England,France,Italy";
		String a[] = new String[] { "A", "B", "C", "D" };
		String ranks = "1,2,3,4,5,6,7";
		System.out.println(countries);
		List<String> convertedCountriesList;

		String[] arrayString = countries.split(",");
		convertedCountriesList = Arrays.asList(arrayString);
		int j=0;
		for (String i : convertedCountriesList) {
			
			System.out.println(j + "=" + i);
			j++;
		}
		
		//convertedCountriesList.remove(0);
		/*int j1=0;
		for (String i : convertedCountriesList) {
			
			System.out.println(j1 + "=" + i);
			j1++;
		}*/
		/*int index=0;
		while (!(convertedCountriesList.isEmpty())){
			//E element = convertedCountriesList.get(k);
			System.out.println("Iterating list using while loop ");
			System.out.println(convertedCountriesList.get(index));
			index++;
		}*/
		StringBuilder stringBuilder = new StringBuilder(100);
		stringBuilder.append("Baeldung");
		stringBuilder.append(" is");
		stringBuilder.append(" awesome");
		System.out.println(stringBuilder);
		
		String myString = "Both".concat(" fickle")
				  .concat(" dwarves")
				  .concat(" jinx")
				  .concat(" my")
				  .concat(" pig")
				  .concat(" quiz");
		
		System.out.println(myString);
		
		String[] strings = {"I'm", "running", "out", "of", "pangrams!"};
		 
		String myString1= String.join(",", strings);
		System.out.println(myString1);
		
		List<String> rgbList = new ArrayList<>();
	    rgbList.add("Red");
	    rgbList.add("Green");
	    rgbList.add("Blue");
	 
	    StringJoiner rgbJoiner = new StringJoiner(
	      ",", "Start", "END");
	 
	    for (String color : rgbList) {
	        rgbJoiner.add(color);
	    }
	    
	    System.out.println(rgbJoiner);
	    
	    StringJoiner joiner1 = new StringJoiner(",");
	    System.out.println("Joiner1"+joiner1);
	    StringJoiner joiner2 = new StringJoiner(",", "Start", "End");
	    System.out.println("Joiner2"+joiner2);
	    joiner1.merge(joiner2);
//merge
	    StringJoiner rgbJoiner1 = new StringJoiner(
	    	      ",");
	    	    StringJoiner cmybJoiner1 = new StringJoiner(
	    	      "-");
	    	    rgbJoiner1.add("Red")
	      .add("Green")
	      .add("Blue");
	    	    cmybJoiner1.add("Cyan")
	      .add("Magenta")
	      .add("Yellow")
	      .add("Black");
	 
	    	    rgbJoiner1.merge(cmybJoiner1);
	    	    System.out.println(rgbJoiner1);
	    	    System.out.println(cmybJoiner1);
	    	  
	   //Arrays	    
	    	    String[] intro = new String[] { "once", "upon", "a", "time" };
	    		String[] abridgement = Arrays.copyOfRange(intro, 1, 5); 
	    		
	    		System.out.println(Arrays.toString(abridgement));
	    		
	    		String[] intro1 = new String[] { "once", "upon", "A", "time" };
	    		System.out.println(Arrays.equals(intro, intro1));
	    		//Arrays.equals(intro, intro1);
	//Sorting
	    		 String[] intro2 = new String[] { "once", "upon", "A", "time" };
	    		 String[] sorted1 = Arrays.copyOf(intro2, 4);
	    		 Arrays.sort(sorted1);
	    		 System.out.println(Arrays.toString(sorted1));
	    		 
	    		 String myString4 = "Both".concat(" fickle")
	    				  .concat(" dwarves")
	    				  .concat(" jinx")
	    				  .concat(" my")
	    				  .concat(" pig")
	    				  .concat(" quiz");
	    		 System.out.println(myString4);
	    		 
	    		 
	    		System.out.println("Is Empty");
	    		System.out.println(myString4.isEmpty());
	    		 
//java 11	    		 String output = "La ".repeat(2) + "Land";
	   // 		 System.out.println(output);
//Array to String	    		
	    		String[] strArray = { "Convert", "Array", "With", "Java" };
	    		StringBuilder stringBuilder1 = new StringBuilder();
	    		for (int i = 0; i < strArray.length; i++) {
	    		    stringBuilder1.append(strArray[i]);
	    		}
	    		String joinedString = stringBuilder1.toString();
	    		System.out.println(joinedString);
	    		
	    		int[] intArray = { 1,2,3,4,5 };
	    		StringBuilder stringBuilder2 = new StringBuilder();
	    		for (int i = 0; i < intArray.length; i++) {
	    		    stringBuilder2.append(Integer.valueOf(intArray[i]));
	    		    //stringBuilder2.append(intArray[i]);
	    		}
	    		String joinedString2 = stringBuilder2.toString();
	    		System.out.println(joinedString2);
	    		
//removing duplicates characters
	    		String str = "aabfghsl";
	    		StringBuilder sb = new StringBuilder();
	    		int idx;
	    		for (int i = 0; i < str.length(); i++) {
	    		    char c = str.charAt(i);
	    		    idx = str.indexOf(c, i + 1);
	    		    if (idx == -1) {
	    		        sb.append(c);
	    		    }
	    		}
	    		System.out.println("StringBuilder Index of" + sb);
	    		
	    		String master = "Hello ldungWorld Baeldung!";
	    		String target = "ldung";
	    		String replacement = "Java";
	    		String processed = master.replaceAll(target, replacement);
	    		String processed1 = master.replace(target, replacement);
	    		System.out.println(processed);
	    		System.out.println(master);
	    		System.out.println(processed.equals(processed1));
	    		
	    		String line1 = "Humpty Dumpty sat on a wall.";
	    		String line2 = "Humpty Dumpty had a great fall.";
	    		String rhyme = line1 + "\n" + line2;
	    		String rhyme1 = line1 + System.lineSeparator() + line2;
	    		String rhyme3 = line1 + System.getProperty("line.separator")  + line2;
	    		
	    		System.out.println(rhyme);
	    		System.out.println(rhyme1);
	    		//int a1 = Integer.parseInt(System.lineSeparator());
	    	//	System.out.println(a1);
	    		
	    		StringBuilder sb7= new StringBuilder();
	    		System.out.println(sb7.length());
	    		int length =3;
	    		String inputString35 = "Hello";
	    		/*if (inputString35.length() >= length) {
	    	     break;
	    	    }*/
	    	    StringBuilder sb34 = new StringBuilder();
	    	    //int x = sb34.length();int y = (length - (inputString35.length()));
	    	   /* while ((sb34.length()) < (length - (inputString35.length()))) {
	    	    	sb34.append('0');
	    	    }*/
	    	    sb34.append(inputString35);
	    	 
	    	    System.out.println(sb34);
	    	   /* String inputString36 = "Hello";
	    	    StringBuilder sb35 = new StringBuilder();
	    	    for (int i = 0; i < length; i++) {
	    	        sb35.append(' ');
	    	    }
	    	    System.out.println(sb35.length());
	    	     
	    	    System.out.println(sb35.substring(inputString36.length()) + inputString36);
	    		*/
	    	    
	    	    String text = "Julia Evans was born on 25-09-1984.";
	    	    System.out.println(text.substring(3));
	    	    System.out.println(text.substring(3,5));
	    	    
//demonstrate how to add a character at any given position in a String in Java.	  
	    	    int  position = 4;
	    	    
	    	    StringBuilder sb44 = new StringBuilder(str);
	    	    sb44.insert(position, ch);
	    	     sb44.toString();
	    	     
//using Substring
	    	     //str.substring(0, position) + ch + str.substring(position);
	
	    	     String text1 = "tHIs Ia TeSt";
	    	     StringBuilder converted = new StringBuilder();
	    	     char[] ch12 = text1.toCharArray();
	    	     boolean convertNext = true;
	    	     for (char ch11 : text1.toCharArray()) {
	    	         if (Character.isSpaceChar(ch11)) {
	    	             convertNext = true;
	    	         } else if (convertNext) {
	    	        	 ch11 = Character.toTitleCase(ch11);
	    	             convertNext = false;
	    	         } else {
	    	        	 ch11 = Character.toLowerCase(ch11);
	    	         }
	    	         converted.append(ch11);
	    	     }
	    	  
	    	    System.out.println(converted.toString());
	
	    	    CharSequence firstString = "bealdung";
	    	    String charSequence = "baeldung";
	    	    System.out.println(firstString==charSequence);
	    	    
	    	    List<Integer> intLIst = Arrays.asList(1, 2, 3);
	    	    
	    	    System.out.println(intLIst);
	    	    String s213 = intLIst.toString();
	    	    
//String to Int/Integer
	    	  /*  int result = Integer.parseInt(givenString);
	    	    Integer result = Integer.valueOf(givenString);
	    	    Integer result = new Integer(givenString);
	    	    int result = Integer.decode(givenString)*/
	    	    		
	    	    		
//char to String
	    	    /*String result = String.valueOf(givenChar);
	    	    String result = Character.toString(givenChar);
	    	    String result = new Character(givenChar).toString();
	    	    String result = givenChar + "";
	    	    String result = String.format("%c", givenChar);*/
	    	    
//random String Example
	    	    
	    	    int n = 20; 
	    	    
	            // Get and display the alphanumeric string 
	            System.out.println(StringExample 
	                                   .getAlphaNumericString(n)); 
	}
	static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
        	int x = AlphaNumericString.length();
        	double y = Math.random();
        	double z = x*y;
        	int r = (int)z;
            int index = (int)(AlphaNumericString.length() * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	
	
	
	
}