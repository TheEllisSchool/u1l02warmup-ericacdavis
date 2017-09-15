import javax.swing.JOptionPane;

public class MakingChange {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount using dollars and cents");
		double num = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "You entered " + num);

	}

}
