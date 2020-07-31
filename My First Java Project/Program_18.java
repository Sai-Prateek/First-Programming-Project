/**
* This program has a method called cubes that has 4 integer parameters and returns 0 if 
* the sum of cubes of first 3 numbers is equal to cube of fourth number and returns -1 otherwise
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_18
{
	public static int cubes(int a,int b,int c,int d)
	{
		int r1,r2;
		r1=a*a*a+b*b*b+c*c*c;
		r2=d*d*d;
		if(r1==r2)
		{
			return 0;
		}
		else
		{ 
			return -1;
		}
	}
}