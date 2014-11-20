
public class Robin extends Bird
	{
	public Robin()
		{
		name = "Robin";
		food = "worms";
		animalFlightBehavior = (FlightBehavior) new Flies();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The robin says, \"Chirp.\"");
		}
	}
