 package javaclasses;

public class NRIAccount extends BankAccount {

	public void applyFixedDeposit()
	{
		super.interestrate=6.5;
		System.out.println("Interest rate"+super.interestrate);
	}
}
