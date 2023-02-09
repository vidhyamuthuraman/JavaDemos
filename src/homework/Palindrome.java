package homework;

public class Palindrome {

	int num=2002;
	int temp=0,digit;
	int reverse;
	
	
	public void check()
	{
		reverse=num;
		
		while(num>0)
		{
			digit=num%10;
			temp=temp*10+digit;
			num=num/10;
			
		}
		
		if(temp==reverse)
	
		System.out.println("Palindrome");
	
	
		else
			System.out.println("Not a Plindrome");
	}
	public static void main(String args[])
	{
		Palindrome p=new Palindrome();
		p.check();
	}
}
	
