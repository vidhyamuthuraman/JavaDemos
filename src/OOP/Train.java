package OOP;

class Train implements IVehicle,IPublicTransport{

	public void drive()
	{
		System.out.println("Train can drive well");	
	}
	public void turnLeft()
	{
		System.out.println("Train can turn left");
	}
	
	public void brake()
	{
		System.out.println("Train is in brake mode");
	}
	
	public void getnumberofpeople()
	{
		System.out.println("numebr of people is 10");
	}
	
	
	
}
