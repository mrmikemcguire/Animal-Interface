
public class Cow extends Mammal
	{
	public Cow()
		{
		name = "cow";
		food = "grass";
		animalFlightBehavior = (FlightBehavior) new CannotFly();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " says, \"Moo.\"");
		}
	}
