/**
* This program an integer input and prints out the following pattern as output. 
* For 5 as integer input:
* 1
* 12
* 123
* 1234
* 12345
* 1234
* 123
* 12
* 1
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_12C
{
	public static void main(String args[])
	{
		Program_12C S1=new Program_12C();
	}
	
	public void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		for(int k=n-1;k>=1;k--)
		{
			for(int m=1;m<=k;m++)
				System.out.print(m);
			System.out.println();
		}
	}
}