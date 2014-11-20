
public class Bat extends Mammal
	{
	public Bat()
		{
		name = "bat";
		food = "insects";
		animalFlightBehavior= (FlightBehavior) new CanFly();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " emits an ultrasonic pulse.");
		}
	}
