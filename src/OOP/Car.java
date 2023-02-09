package OOP;

class Car extends MotorisedVehicle implements IVehicle {

	public void drive()
	{
		System.out.println("car can drive well");	
	}
	public void turnLeft()
	{
		System.out.println("car can turn left");
	}
	
	public void brake()
	{
		System.out.println("car is in brake mode");
	}

}
