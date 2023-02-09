package javaclasses;

public class SeniorCitizen extends BankAccount{

	
	public void applyFixedDeposit ()
	{
		super.interestrate=10.5;
		System.out.println("Interest rate"+super.interestrate);
	}

}
