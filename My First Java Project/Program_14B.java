/**
* This program has a function called bsearch() that uses binary search algorithm to
* find the input string in a string array and prints out the result.
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
public class Program_14B
{
	public void bsearch(String s1)
	{
		String s[] = {"ABC","DEF","XYZ","SDF","GHJ","KLM"};
		int flag=0,L,U,M=0;
		L=0;
		U=5;
		while(L<=U)
		{
			M=(L+U)/2;
			if(s1.compareTo(s[M])>0)
				L=M+1;
			else if (s[M].compareTo(s1) < 0)
				U=M-1;
			else
			{
				flag=1;
				break;
			}	                      
		}
		if(flag==1)
			System.out.println("Element present");
		else
			System.out.println("Element not present");
	}	                  	                          
}
