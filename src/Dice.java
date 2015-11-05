
public class Dice {

	public int Throw()
	{
		int classRandom = 1 + (int) ( Math.random() * (6) );
		return classRandom;
	}
	
	public void Value()
	{
		int classRandom = Throw();
		System.out.println("Dice number is " + classRandom);
		
	}

}


