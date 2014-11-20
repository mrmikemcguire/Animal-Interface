
public class Bat extends Mammal
	{
	public Bat()
		{
		name = "Bat";
		food = "insects";
		animalFlightBehavior= (FlightBehavior) new Flies();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The bat emits an ultrasonic pulse.");
		}
	}
