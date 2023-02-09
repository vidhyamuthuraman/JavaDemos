package javaclasses;
import java.util.*;


public class SumOfDigits 
{

public static void main(String[] args)
{   int num,digit,sum=0;
	Scanner s=new Scanner(System.in);

	//Sum Of digits
System.out.println("Enter number");
	num=s.nextInt();
  while(num>0)
	{
		 digit=num%10;
		 sum=sum+digit;
		 num=num/10;
	}
	System.out.println("Sum of number is"+sum);
	
	
	//Palindrome
	int number;
	System.out.println("Enter number for Palindrome");
	number=s.nextInt();
	int original,reverse;
	original=number;
	reverse=0;
	while(number>0)
	{
		int temp=number%10;
		reverse=reverse*10+temp;
		number=number/10;
		
	}
	if(reverse==original)
		System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");
	
	}
		 
	
	}
