package homework;

public class AveMethod {

	public static void main(String args[])
	{
		//object for Average class
		Average i=new Average();
		
		//Average of three numbers
		i.a=10;
		i.b=20;
		i.c=25;
		float f=i.calculateave();
		System.out.println(f);
		
		// Area of Triangle
		i.height=10;
		i.base=20;
		int area1=i.triangle();
		System.out.println(area1);
		
		//Smallest of three numbers
		i.smallest();
		
	}
}
