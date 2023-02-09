package homework;
import java.util.Scanner;

public class Scanneruse {

		
	public static void main(String args[])
	{    int a;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name");
	    String name=s.next();
		
		System.out.println( "Enter Math mark ");
		int mark1=s.nextInt();
		
		System.out.println( "Enter Science mark ");
		int mark2=s.nextInt();
		
		System.out.println( "Enter English  mark ");
		int mark3=s.nextInt();
		
		System.out.println(name);
		a=(mark1+mark2+mark3)/3;
		System.out.println( "Average is "+a);
		
	}
	
}