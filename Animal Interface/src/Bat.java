
public class Bat extends Mammal implements Flyable
	{
	public Bat()
		{
		name = "bat";
		food = "insects";
		}
	@Override
	public void makeNoise()
		{
		System.out.println("The " + name + " emits an ultrasonic pulse.");
		}
	public void flies()
		{
		System.out.println("Look, Ma, I can fly!");
		}
	}
