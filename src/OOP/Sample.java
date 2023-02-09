package OOP;

public interface Sample {

	public void add();
	public void sub();
	
}

class Interfacedemo implements Sample,Sample1
{
	public void add()
	{
		System.out.println("Addition");
		
	}
	public void sub()
	{System.out.println("subtraction");}

	public void mul()
	{
		System.out.println("Multiplication");
		
	}
	
}