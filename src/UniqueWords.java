/*
 * Project: CUS1156_Lab2
 * Class: UniqueWords.java
 * Author: Branden Marsh
 * Date: February 26, 2026
 * This program counts the number of unique words in an ArrayList
 */

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	//--------------------------------------------------------------------------
	//This method counts the number of unique strings in a list
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
      for (int i = 0; i < list.size(); i++)
      {		 
    	  boolean isUnique = true;
    	  
    	  // Check if this word appeared earlier in the list
    	  for (int j = 0; j < i; j++)
		 {
    		  if (list.get(i).equals(list.get(j)))
    		  {
    			  isUnique = false;
    			  break;
    		  }
		 }
      
    	  if (isUnique)
    	  {
    		  count++;
    	  
    	  }
     }
	 return count;
   }
   
   //--------------------------------------------------------------------------
   // Main method tests the countUnique method
   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
