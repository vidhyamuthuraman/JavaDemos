package practice;

public class Stringpra {
public static void main(String args[])
{
	String str="Saturuay";
	int count=1;
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				count=count+1;
			}
		}
		
		if(count>1)
		{
			System.out.println(str.charAt(i)+ " appears: " + count);
			count=1;
		}
	}
}
}
