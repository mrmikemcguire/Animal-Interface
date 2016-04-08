
public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "penguin";
		food = "fish";
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " says, \"Brrr....\"");
		}


	}
