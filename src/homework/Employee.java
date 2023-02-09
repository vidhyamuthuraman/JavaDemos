package homework;

public class Employee {
long employeeid;
String employeeName,employeeAddress;
long employeePhone;
double basicSalary;
double specialAllowance=250.80;
double Hra=1000.50;

Employee(long Id,String Name,String address,long phone)
{
	this.employeeid=Id;
	this.employeeName=Name;
	this.employeeAddress=address;
	this.employeePhone=phone;
}
public void calculatesalary()
{   double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	System.out.println("Salary is "+salary);
}
public void calculateTransportAllowance()
{  double transportAllowance;
   double salary;
   transportAllowance = (15*basicSalary)/100;

   System.out.println("Transport Allowance is "+ transportAllowance);
   salary=basicSalary+transportAllowance;
   System.out.println("Basic pay:"+basicSalary+" "+ " Travel awllowance:"+transportAllowance+" Total Salary: "+ salary);
   
      
}


	
}
