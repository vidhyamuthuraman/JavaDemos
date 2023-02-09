package javaclasses;

public class ConstructorCall {

	String name1;
	int id;
	
	ConstructorCall(ConstructorUse c2)
	
	{
	name1=c2.name;
	id=c2.id;
	System.out.println(name1 + id);	
	}
	
	public static void main(String args[])
	
	{
		ConstructorUse c2=new ConstructorUse("Harini",20);
		ConstructorCall c3=new ConstructorCall(c2);
		

		
		
		
		
	}
}
