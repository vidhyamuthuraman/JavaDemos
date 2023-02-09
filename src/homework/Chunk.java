package homework;
import java.util.Scanner;
public class Chunk {
	
	public static void main(String[] args)
	{
	String str;
	int count=0;
	int max=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter string");
	str=s.nextLine();
	for(int i=0;i<str.length()-1;i++)
	{
		
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
				
			}
			
			/*if(count>max)
			{
				max=count;
				count=max+1;
				System.out.println(count);
			}*/
		}
		System.out.println(count);
	}

	
	}
	




