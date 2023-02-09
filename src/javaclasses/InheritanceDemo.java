package javaclasses;

public class InheritanceDemo {

	
	public static void main(String args[])
	{ 
		BankAccount b=new BankAccount();
	  System.out.println(b.interestrate);
		NRIAccount n=new NRIAccount();
	SeniorCitizen s=new SeniorCitizen();
	
	s.depositamount=100;
	s.withdrawalamount=50;
	s.depositMoney();
	s.withdrawMoney();
	s.applyFixedDeposit();
	
	
	n.depositamount=50;
	n.withdrawalamount=25;
	
	n.depositMoney();
	n.withdrawMoney();
	n.applyFixedDeposit();
	
	
		
	}
	
}
