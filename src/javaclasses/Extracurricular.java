package javaclasses;

public class Extracurricular {
	
AcademicInfo a=new AcademicInfo();
BasicInfo b=new BasicInfo();
	
	public void eligible()
	{   b.display();
	  
	    a.calculate();
	   if(a.total>90)
		   
		   
	   System.out.println("Eligible");
	   else
		   System.out.println("Not eligible");
	   
	}
}
