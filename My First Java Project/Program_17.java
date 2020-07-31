/**
* THis program has three overloads for the  method area() that print out the area of
* circle or square or rectangle based on the input paramaters
*
* Author     : Sai Prateek Reddy Annaiahgari
* Date       : 2010-11-30 
* Copyright International Educational Academy, Hyderabad, India
*/
class Program_17
{
	double ar;
	void area(double r)
	{
		ar=3.14*r*r;
		System.out.println("Area of circle ="+ar);
	}
	void area(int s)
	{
		ar=s*s;
		System.out.println("Area of square ="+ar);
	}
	void area(int l,int b)
	{
		ar=l*b;
		System.out.println("Area of rectangle ="+ar);
	}
}