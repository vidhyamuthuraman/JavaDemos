package homework;

public class Trainee extends Employee
{
	Trainee(long Id,String Name,String address,long phone,double basicsalary)
	{
		super(Id,Name,address,phone);
		this.basicSalary=basicsalary;
		
	}
	public void calculateTransportAllowance()
	{  
		super.calculateTransportAllowance();
		
	}


}
