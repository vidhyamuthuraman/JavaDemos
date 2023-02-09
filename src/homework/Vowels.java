package homework;

import java.util.Scanner;

public class Vowels {

	public static int countvowels(String str)
	
	{   int count=0;
		String s=str;
		for(int i=0;i<s.length();i++)
		{
			if(str.charAt(i)=='a'|str.charAt(i)=='e'||str.charAt(i)=='i'|str.charAt(i)=='o'|str.charAt(i)=='u')
			{
				count=count+1;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		Vowels v=new Vowels();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str1=s.nextLine();
		System.out.println("No.Vowels is "+v.countvowels(str1));
		
				
	}
}
