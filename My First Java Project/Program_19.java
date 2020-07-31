/**
* This program demonstrates the constructor overload with date, month and year as variables.
* It contains a function definition for useProgram_19() to demonstrate the use of constructors
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_19
{
	int dd,mm,yy;
	public Program_19()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	public Program_19(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void useProgram_19()
	{
		Program_19 Date=new Program_19(1,1,1900);
		System.out.println(Date.dd+"/"+Date.mm+"/"+Date.yy);
		Program_19 date1=new Program_19();
		System.out.println(date1.dd+"/"+date1.mm+"/"+date1.yy);
	}
}