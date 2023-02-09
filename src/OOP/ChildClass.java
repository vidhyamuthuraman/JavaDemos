package OOP;

public class ChildClass extends ParentClass{


	ChildClass()
	{
     
    a=5;
    b=15;
    c=25;
	}
	public void add()
	{
		int c=a+b;
		System.out.println("Child Class "+c);
	}
	
	public static void main(String args[])
	{
		
		ChildClass c=new ChildClass();
		c.add();
		c.display();
	}
}
