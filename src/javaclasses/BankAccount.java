package javaclasses;

public class BankAccount {
  double depositamount,withdrawalamount,balance;
  double interestrate=9.5;
  
	public void depositMoney()
	{
		System.out.println("Deposit Money "+depositamount);
		
	}
	
	public void withdrawMoney()
	{
	System.out.println("Withdrawalmoney "+withdrawalamount);
	balance=depositamount-withdrawalamount;
	System.out.println("Balance "+balance);
	
	}
}
