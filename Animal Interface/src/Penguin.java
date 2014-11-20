
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "Penguin";
		food = "Fish";
		animalFlightBehavior = (FlightBehavior) new NoFly();
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The penguin says, \"Brrr....\"");
		}
	}
