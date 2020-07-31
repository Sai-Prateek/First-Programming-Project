/**
* This program generates the sum of double iterative cumulative sum of n numbers.
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_10B
{
	public void Program_10B(int n)
	{
		long sum=0;long tot=0;
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				sum=sum+j;
			}
			tot=sum+tot;
			sum=0;
		}
		System.out.println(tot);
	}
}


