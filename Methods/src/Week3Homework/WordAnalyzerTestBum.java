package Week3Homework;

import WordAna.WordAnalyzer;

/*OUTPUT 
Get first repeated character:
 
First repeated character in aardvark is a
First repeated character in roommate is o
First repeated character in matte is t
No repeated character.
No repeated character.

Get first multiple character:
 
First multiple character for word aardvarkis char a
First multiple character for word roommateis char o
First multiple character for word matteis char t
No multiple character.
First multiple character for word testis char t
 
Get count of repeated characters:
 
aardvark has 1 groups of repeated characters
roommate has 2 groups of repeated characters
mette has 1 groups of repeated characters
mate has 0 groups of repeated characters
test has 0 groups of repeated characters
 * 
 */

public class WordAnalyzerTestBum
{
   public static void main(String[] args) //changed Main to main, added s to arg  
   {
	   System.out.println(" Get first repeated character:");
	   System.out.println(" ");
      test("aardvark"); // expect: a
      test("roommate"); // expect: o (not m)
      test("matte"); // expect: t (duplicate letter t)
      test("mate"); // expect 0 (no duplicates)
      test("test"); // expect: 0 (no duplicates)
      System.out.println("");
      System.out.println("Get first multiple character:");
      System.out.println(" ");
      test2("aardvark"); // expect: a
      test2("roommate"); // expect: o (not m)
      test2("matte"); // expect: t (duplicate letter t)
      test2("mate"); // expect 0 (no duplicates)
      test2("test"); // expect: t ( t duplicates)
      System.out.println(" ");
      
      System.out.println("Get count of repeated characters:");
      System.out.println(" ");
      test3("aardvark"); // expect: 1
      test3("roommate"); // expect: 2 
      test3("mette"); // expect: 1
      test3("mate");  //expect 0
      test3("test"); // expect: 0 
   
   }

   public static void test(String s)
   {
      WordAnalyzer wa =  new WordAnalyzer(s); //added new
     char result = wa.firstRepeatedCharacter(); //changed String into char
      if (result == '0') //added missing = and '' 
         System.out.println("No repeated character.");
      else
         System.out.println("First repeated character in " + s + " is "+ result);
   
   
   }
   
   public static void test2(String s)
   {
	   WordAnalyzerCorrect w2= new WordAnalyzerCorrect(s);
	   char result = w2.firstMultipleCharacter(); 
	   if (result == '0') 
	         System.out.println("No multiple character.");
	      else
	
	    	  System.out.println("First multiple character for word " + s + "is char " + result);
	   
	   
	 
   }
	
   public static void test3(String s)
   {
	   WordAnalyzerCorrect w3= new WordAnalyzerCorrect(s);
	   int result = w3.countRepeatedCharacters(); 
	   if (result == 0) //add missing = & '' 
	         System.out.println(s + " has " + result + " groups of repeated characters");
	
	   else 
	   System.out.println(s + " has " + result + " groups of repeated characters");
	   
	 
   }
   
   
   
}