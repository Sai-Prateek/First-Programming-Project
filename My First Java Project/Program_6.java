/**
* This program takes an integer number input from the user and prints the Sum of its digits
* and number of digits
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_6
{
	public void main(int n)
	{
		int rem=0;
		int sum=0;
		String s=Integer.toString(n);
		int i=s.length();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digits ="+sum);
		System.out.println("Number of digits="+i);
	}
}