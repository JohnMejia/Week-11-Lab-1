
public class Dice {

	private int diceNumber;
	
	public int Throw()
	{
		diceNumber = 1 + (int) ( Math.random() * (6) );
		return diceNumber;
	}
	
	public void Value()
	{
		
		System.out.println("Dice number is " + diceNumber);
		
	}

}


