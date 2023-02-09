package homework;

public class SecondsConversion {

	int second=10000;
	
	public void convert()
	{
		int hours=second/3600;
		int temp=second%3600;
	     int minute=temp/60;
		int sec=temp%60;
		System.out.println(hours +": "+minute+" :"+sec);
		
		
	}   
	
	public static void main(String args[])
	{
		SecondsConversion s=new SecondsConversion();
		s.convert();
		
	}
}
