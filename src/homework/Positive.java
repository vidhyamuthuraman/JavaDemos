package homework;
import java.util.*;
public class Positive {

	public static void main(String args[])
	{
	
		//+Ve or -Ve number
	 System.out.println("Enter number to check +Ve or -Ve:");
	 Scanner s=new Scanner(System.in);
	 int num=s.nextInt();
	
	if(num>0)
		{System.out.println("Number is +Ve");}
	else
		{System.out.println("Number is -Ve");}
	
	//Multiplication table of given number
	System.out.println("Enter number for multplication:");
	int multiply=s.nextInt();
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(multiply+"*"+i+"="+i*multiply);
	 }
	 

		
	}
	
}
