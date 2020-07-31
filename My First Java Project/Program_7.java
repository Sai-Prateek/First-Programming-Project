/**
* This program takes a number input 'n' from the user and prints out all the Prime numbers  
* between 2 and 'n'
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_7
{
	public static void main(int n) 
	{                                                      
		int[] arr = new int[n+1];
		for (int i = 2; i <= n; i++) 
		{ 
			arr[i] = i; 
			int ifCount = 2; 
			int elseCount = 2; 
			for (int j = 2; j < i; j++) 
			{ 
				if (i % arr[j] == 0) 
					ifCount++; 
				else 
					elseCount++; 
			} 
			if (elseCount == i) 
				System.out.print(i+ " "); 
		} 
	}
}
