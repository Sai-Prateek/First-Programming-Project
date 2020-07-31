/**
* This program prompts user to input a number and check it to be perfect, special, prime or palindrome 
* based on the user's choice. THe program uses switch-case statements.
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
import java.io.*;
public class Program_5
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num,ch;
	void accept()throws IOException
	{
		System.out.println("enter no");
		int num=Integer.parseInt(br.readLine());
	}
	
	void menu()throws IOException
	{ 
		System.out.println("check if no is");
		System.out.println("1.palidrome 2.perfect no 3.special no 4.prime no \n enter choice");
		ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:accept();
				palindrome(num);
				break;
			case 2:accept();
				perfect(num);
				break;        
			case 3:accept();
				special(num);
				break;
			case 4:accept();
				prime(num);
				break;
			default:System.out.println("wrong choice");
		}
	}
	
	void palindrome(int n)
	{
		int rev=0,rem;
		int num=n;
		while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		if(rev==num)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	void perfect(int n)
	{
		int sum=0;
		for(int d=0;d<n/2;d++)
		{
			if(n%d==0)
				sum=sum+d;
		}
		if(sum==n)
			System.out.println("perfect");
		else
			System.out.println("not perfect");
	}

	void special(int n)
	{
		int rem,i,m,sum=0,f;
		m=n;
		while(n>0)
		{
			rem=n%10;
			f=1;
			for(i=1;i<=rem;i++)
				f=f*i;
			sum+=f;
			n=n/10;
		}
		if(sum==m)
			System.out.println("special");
		else
			System.out.println("not special");          
					
	}
				
	void prime(int n)
	{
		int ctr=0;
		for(int d=1;d<=n;d++)
		{
			if(n%d==0)
				ctr++;
		}
		if(ctr==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
             