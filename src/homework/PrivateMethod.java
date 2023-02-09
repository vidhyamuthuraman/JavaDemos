package homework;

public class PrivateMethod {
	//Method declaration 
	private static int getSquare(int x)
	{
			return x*x;
	}
	
	//Main Method
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)
	{
		int result1=getSquare(i);
		System.out.println("Square of "+i + "is "+ result1);
	}
	

}
}

