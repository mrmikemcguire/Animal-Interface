
public class Cow extends Mammal
	{
	public Cow()
		{
		name = "Cow";
		food = "grass";
		animalFlightBehavior = (FlightBehavior) new NoFly();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The cow says, \"Moo.\"");
		}
	}
