package homework;

public class Average {

	//properties a,b,c,d,area,height,base
	//action calulateave(),triangle(),smallest()


	float a,b,c,d;
	int area,height,base;

	//Average of three numbers
	public float calculateave()

	{
		d=(a+b+c)/3;
		return d;
	}
	//Area of Triangle
	public int triangle()
	{
		area=(height*base)/2;
		return area;


	}
	//Smallest of three numbers
	public void smallest()
	{
		if (a<b&&a<c)
		{ System.out.println("A is smallest"); }
		else if (b<c)
		{ System.out.println("B is smallest"); }
		else
		{System.out.println(" C is smallest");
		}

	}
}

