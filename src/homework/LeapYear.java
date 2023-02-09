package homework;
import java.util.*;

public class LeapYear 
{

public static void main(String args[])
{
	
System.out.println("Enter year");
Scanner s=new Scanner(System.in);
int year=s.nextInt();

if(year%4==0)
{
	 if(year%100==0)
	 {
		 if(year%400==0)
		    System.out.println("Leap year");
	     else
		    System.out.println("Not a leap year");
	 }
	 else
    	 System.out.println("Leap Year");
		 
		 
}
else
	System.out.println("Not a LeapYear");




}}

