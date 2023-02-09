package OOP;
import java.util.Scanner;
public class StringMain {
	
	public static void main(String args[])
	{
Scanner s=new Scanner(System.in);
System.out.println("Please Enter String");

String str=s.nextLine();
int out=UserMainCode.checkCharacters(str);
if(out==1)
{System.out.println("Valid");}
else
	System.out.println("Invalid");
}

	
}


