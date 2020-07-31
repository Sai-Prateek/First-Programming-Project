/**
* This program has a function called grtLongestWordSize() that takes an array of strings and
* returns the longest word size. 
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_4
{
	public  static int getLongestWordSize(String[] words)
	{
		int longest = 0;
		for (int i = 0; i < words.length; i++) 
		{
			int currentSize = words[i].trim().length();
			if (longest < currentSize)
			{
				longest = currentSize;
			}
		}
		return longest;
	}

	public static void main(String[] args) 
	{
		String[] testWords = {"India", "is", "my", "country"};
		System.out.println("Longest word size: " + getLongestWordSize(testWords));

	}

}

