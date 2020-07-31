/**
* This program takes 15 numbers as input, stores it in a 5x3 array, calculates and, prints the sum 
* product and average of the numbers
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
class Program_13
{
	public void main()throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s;
		int a[][]=new int[5][3];
		int sum=0;
		int pro=1;
		double avg=0;
		System.out.println("Enter 15 Numbers");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				s=br.readLine();
				int b=5;
				a[i][j]=Integer.parseInt(s);
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=sum+a[i][j];
				pro=pro*a[i][j];
			}
		}
		System.out.println("Sum ="+sum);
		System.out.println("Product ="+pro);
		System.out.println("Average ="+(sum/15));
	}
}
