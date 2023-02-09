package homework;
import java.util.*;
public class Increasing {

	public static void main(String args[])
	{
		System.out.println("Enter 3 numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1<num2&&num1<num3)
		{
			
			if(num2<num3)
			{
				System.out.println("Increasing order");
				
			}
			else
				System.out.println("Not in particlular order");
		}
		else if(num1>num2&&num1>num3)
			{
				
			if(num2>num3)
			{
				System.out.println("Decreasing order");
				
			}
			else
				System.out.println("Not in prticular order");
			}
		else
			System.out.println("Not in particular order");
		
	}
}
