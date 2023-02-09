package homework;

public class Circle {
double radius;
double area;
double pi=3.14;
	Circle()
	{
		radius=1;
		
	}
	
	Circle(double r)
	{
		radius=r;
	}

public double getdata()
{
area=pi*radius*radius;
return area;

}

public static void main(String args[])
{
	// Default radius 1;
	Circle c=new Circle();
	c.getdata();
	System.out.println("Radius: " +c.radius + " Area: "+c.area);
	
	//Radius 2.0
	Circle c1=new Circle(2.0);
	c1.getdata();
	System.out.println("Radius: " +c1.radius + " Area: " +c1.area);
	
	//Radius 12
	Circle c2=new Circle(12);
	c2.getdata();
	System.out.println("Radius: " +c2.radius + " Area: "+c2.area);
	
	//Radius 24
	Circle c3=new Circle(24);
	c3.getdata();
	System.out.println("Radius: " +c3.radius + " Area: "+c3.area);
	
	
	
}

}


