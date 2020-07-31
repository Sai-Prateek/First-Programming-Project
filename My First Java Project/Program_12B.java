/**
* This program an integer input and prints out the following pattern as output. 
* a
* ab
* abc
* abcd
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_12B
{
	public static void main(String args[])
	{
		Program_12B S2=new Program_12B ();
		S2.pattern2(4);
	}
	
	public void pattern2(int n)
	{
		for(int i=97;i<97+n;i++)
		{
			for(int j=97;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}


