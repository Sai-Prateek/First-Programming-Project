/**
* This program prints sum of n ^ (n+1) series until nth term given by the user .
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_10A
{
	public void Program_10A(int n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			double j=Math.pow(i,i+1);
			sum=sum+j;
		}
		System.out.println(sum);
	}
} 