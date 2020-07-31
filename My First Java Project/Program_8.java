/**
* This program prints out the fibonacci series from 0 to 'n' (User input) 
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_8
{
	public void fibo(int n)
	{
		int i;
		long first,second,third;
		first=0;
		second=1;
		System.out.print("Fibonacci Series -->");
		System.out.print(first+"\t"+second);
		for(i=2;i<n;i++)
		{
			third=first+second;
			System.out.print("\t"+third);
			first=second;
			second=third;
		}
	}
} 