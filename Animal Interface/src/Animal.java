
public abstract class Animal
	{
	protected String name;
	protected String food;
	protected FlightBehavior animalFlightBehavior;
	public abstract void bearYoung();
	public void eat()
		{
		System.out.println("The " + name + " is looking forward to eating " + food +".");
		}
	public void makeNoise()
		{
		
		}
	public String getName()
		{
		return name;
		}
	}
