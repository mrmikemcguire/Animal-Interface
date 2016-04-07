
public class Robin extends Bird implements Flyable
	{
	public Robin()
		{
		name = "robin";
		food = "worms";
		}
	
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " says, \"Chirp.\"");
		}
	public void flies()
		{
		System.out.println("Look, Ma, I can fly!");
		}
	}
