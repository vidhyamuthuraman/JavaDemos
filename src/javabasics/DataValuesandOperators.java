package javabasics;

public class DataValuesandOperators {
	public static void main(String []args)
	{
		int tamil=90,english=97,math=95,science=90,social=96,total;
		double avg;
		/*if(tamil>=90&&english>=90)
			{
			tamil+=5;
		    english+=5;
			}
		    
		else if(tamil>=90||english>=90)
		{
			tamil+=3;
		    english+=3;
		}
		else
		{
			tamil=++tamil;
			english=--english;
		}*/
		
		total=tamil+english+math+science+social;
		avg=total/5;
	
		/*System.out.println("Tamil score is " +tamil);
		System.out.println("English score is " +english);*/
	
		System.out.println("Average is "+ avg);
		
		
		if(avg>90)
		{
			System.out.println("Passed with distinction");
		}
		else if(avg>=70&&avg<=90)
		{
			System.out.println("First class");
		}
		else if(avg>=40&&avg<=70)
		{
			System.out.println("second class");
			
		}
		else
		{
			System.out.println("failed");
		}
		
		}
			


}
