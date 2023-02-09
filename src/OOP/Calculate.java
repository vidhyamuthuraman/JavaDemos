package OOP;

public class Calculate {

	public void add(int a,int b)
	
	{
		int sum=a+b;
		System.out.println("Two Integer parameters "+sum);
		
	}
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Three Integer Parameters "+sum);
	}
	public void add(double a,double b)
	{
		double sum=a+b;
		System.out.println("Two double Parameters "+sum);
		

	}
	
	public static void main(String args[])
	{
	Calculate c=new Calculate();
	c.add(5, 3);
	c.add(15,13,14);
	c.add(2.0,3.0);
	}
	
	
}
