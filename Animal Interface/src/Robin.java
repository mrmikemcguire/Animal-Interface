
public class Robin extends Bird
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		animalFlightBehavior = (FlightBehavior) new CanFly();
		}
	
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}
	}
