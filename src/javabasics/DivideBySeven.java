package javabasics;

public class DivideBySeven {
	public static void main(String args[])
	{
		int i,r;
		for(i=7;i<=50;i=i+7)
		{
			System.out.println(i+" is Divisible by 7");
			
			
		}
		//ANOTHER METHOD
		
System.out.println("ANOTHER METHOD");
	for(i=1;i<=50;i++)
	{
		r=i%7;
		if(r==0)
		{System.out.println(i);}
	}
	
	}

}
