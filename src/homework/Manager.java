package homework;

public class Manager extends Employee
{
	
	Manager(long Id,String Name,String address,long phone,double basicsalary)
	{
		super(Id,Name,address,phone);
	
		this.basicSalary=basicsalary;
		
	}
	public void calculateTransportAllowance()
	{  double transportAllowance;
	   double salary;
	   transportAllowance = 10*basicSalary/100;
	   System.out.println("Transport Allowance is "+ transportAllowance);
	   salary=basicSalary+transportAllowance;
	   System.out.println("Basic pay:"+basicSalary+" "+ " Travel awllowance:"+transportAllowance+" Total Salary: "+ salary);
	   
	   
	   
	}

	
}


