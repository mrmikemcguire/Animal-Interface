
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		animalFlightBehavior = (FlightBehavior) new CannotFly();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " says, \"Brrr....\"");
		}
	}
