package javaclasses;

public class ConstructorPractice {
	int a,b,c,sum,sum1;
	
	ConstructorPractice ()
	{
		
	}
	ConstructorPractice(int x,int y)
	{
		a=x;
		b=y;
		sum=a+b;
		
	}
	ConstructorPractice(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		sum1=a+b+c;
		
	}
	
	public static void main(String args[])
	{
		ConstructorPractice c=new ConstructorPractice();
		//System.out.println(c.sum +c.sum1);
		
		ConstructorPractice c1=new ConstructorPractice(5,10);
		System.out.println(c1.sum+ " "+ c1.sum1);
		
		ConstructorPractice c2=new ConstructorPractice(10,10,10);
		System.out.println(c2.sum + " "+c2.sum1);
		 
		
		
		
		
	}
	
	
}
