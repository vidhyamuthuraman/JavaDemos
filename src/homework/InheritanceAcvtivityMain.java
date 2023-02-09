package homework;

public class InheritanceAcvtivityMain {
	
	public static void main(String args[])
	{
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		m.calculatesalary();
		m.calculateTransportAllowance();
		
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,65000);
		t.calculatesalary();
		t.calculateTransportAllowance();
		
		
	}

}
