import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) 
	{
		String doAgain;

		do{
			JOptionPane.showMessageDialog(null, "Throwing the dice!");
			Dice dice = new Dice();

			dice.Throw();
			dice.Value();

			doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
			while(!(doAgain.matches("[YN]+"))) 
			{				
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");
				doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();

			}
		}while (!(doAgain.equals("N")));
		JOptionPane.showMessageDialog(null, "Goodbye!");
	}
}