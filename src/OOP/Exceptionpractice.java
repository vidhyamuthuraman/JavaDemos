package OOP;

public class Exceptionpractice {

	public static void main(String[] args)
	{
		int[] a= {2,3,4,5};
		
		try {
		System.out.println(a[4]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
}
}