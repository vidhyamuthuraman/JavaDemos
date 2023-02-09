package javabasics;

public class Multiples {
	
	public static void main(String args[])
	{int i;
		for(i=1;i<=45;i++)
		{
			if(i%3==0&&i%5==0)
				System.out.println(i+" Falling under group 3 and 5");
			else  if(i%3==0)
				   System.out.println(i+" Falling group 3");
		
			else if(i%5==0)
				System.out.println(i+" Falling under group 5");
		}
	}

}
