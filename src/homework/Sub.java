package homework;

public class Sub extends Super{
public void display()
{
	System.out.println(x);
	
}
public static void main(String args[])
{
	new Sub().display();
}
}
