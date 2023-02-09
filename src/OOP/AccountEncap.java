package OOP;

public class AccountEncap {
	private int accountbal;
	
	
	public int getAccountbal() {
		return accountbal;
	}
	public void setAccountbal(int accountbal) {
		this.accountbal = accountbal;
	}
	
	
	
	
	public void deposit(int a)
	{
		if(a<0)
		{
			System.out.println("Insufficient");
		
		}
		else
			accountbal=accountbal+a;
	}
	
	
	

}
