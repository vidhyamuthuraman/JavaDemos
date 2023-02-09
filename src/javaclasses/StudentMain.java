package javaclasses;

public class StudentMain {
public static void main(String args[])
{
	
	BasicInfo m1=new BasicInfo();
	AcademicInfo m=new AcademicInfo();
	Extracurricular m2=new Extracurricular();
	m1.name="Harini";
	m1.id=82345;
	m1.grade=10;
	m1.display();
	
	
	m.mark1=90;
	m.mark2=95;
	m.calculate();
	
	m2.eligible();
	

	
}
}
