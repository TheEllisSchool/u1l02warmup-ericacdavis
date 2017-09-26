import javax.swing.JOptionPane;

public class MakingChange {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter your first amount using dollars and cents");
		double num1 = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		input = JOptionPane.showInputDialog(null, "Enter a second amount of money in dollars and cents");
		double num2 = Double.parseDouble(input);
		
		double average = (num1 + num2) /2;
		int cents = (int) (average * 100);
		int quarters = cents/25;
		int dimes = (cents - quarters * 25)/10;
		int nickles = (cents  - quarters *25 - dimes *10)/5;
		int pennies = cents - quarters *25 - dimes *10 - nickles *5;
		
		JOptionPane.showMessageDialog(null, "$" + average + " is " + quarters + " quarters and " + dimes 
				+ " dimes and "+ nickles  
				+ " nickles and " + pennies + " pennies.");
		//this is a test
	}

}
