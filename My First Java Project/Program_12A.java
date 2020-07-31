/**
* This program an integer input and prints out the following pattern as output for n=4: 
*    1
*   121
*  12321
* 1234321
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_12A
{
	public void pattern(int n)
	{
		int i,j,c,k;
		c=n-1;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=c;k++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(j);
			for(j=i-1;j>=1;j--)
				System.out.print(j);
			System.out.println( );
			c=c-1;
		}
	}
}