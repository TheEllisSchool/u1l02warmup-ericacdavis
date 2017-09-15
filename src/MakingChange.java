import javax.swing.JOptionPane;

public class MakingChange {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount using dollars and cents");
		double num = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);

		int cents = (int) (num * 100);
		int quarters = cents/25;
		int dimes = (cents - quarters * 25)/10;
		int nickles = (cents  - quarters *25 - dimes *10)/5;
		int pennies = cents - quarters *25 - dimes *10 - nickles *5;
		
		JOptionPane.showMessageDialog(null, "$" + num + " is " + quarters + " quarters and " + dimes 
				+ " dimes and "+ nickles  
				+ " nickles and " + pennies + " pennies.");
		//this is a test
	}

}
