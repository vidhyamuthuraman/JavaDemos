package homework;

public class MethodReturnType {

	//Method that returns integer value
	public int addNumbers(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	
	//Method without parameter
	public void display()
	{
		System.out.println("Method without parameter");
		
	}
	
	
	//Method with single parameter
	public void display1(int a)
	{
		System.out.println("Method with single parameter "+a);
		
	}
	
	
	public static void main(String args[])
{
	int num1=25;
	int num2=15;
	MethodReturnType obj1=new MethodReturnType();
	int result=obj1.addNumbers(num1, num2);
	System.out.println("Sum is "+result);
	obj1.display();
	obj1.display1(100);
	
	

	
	
}
}
