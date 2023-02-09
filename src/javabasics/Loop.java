package javabasics;

public class Loop {
	
	public static void main(String args[])
	{
	int i,r;
	for(i=1;i<=50;i++)
	{
		r=i%5;
	
		if(r==0)
		{
		System.out.println(i+" is divisible by 5");
		}

	}
	
	//ANOTHER METHOD
	System.out.println("ANOTHER METHOD");
	
	  for(i=5;i<=50;i=i+5)
	 {
	  System.out.println(i);
	  }
	 
	}
	}

	
	


/*while(i>=1)
	{
		System.out.println(i);
		i--;
	for(i=2;i<=10;i=i+2)
	{
		System.out.println("Straight"+i);
	
	}*/
	


