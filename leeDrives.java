package week1laboratory2;

import javax.swing.JOptionPane;

//made by me Mr.Clyde Allen Yu :D
public class leeDrives {
	public static void main(String[] args) {
		//input
		int flashDrives = Integer.parseInt(JOptionPane.showInputDialog(null, "How many flash drives do you have?", "Flash Drives", JOptionPane.QUESTION_MESSAGE));
		
		//calculating the drives
		int gross, dozen, leftovers;
		
		gross = flashDrives / 144;
		dozen = (flashDrives % 144) / 12;
		leftovers = flashDrives % 12;
		
		//displaying the output
		String result = ("Mr. Lee, you have " + gross + " gross, " + dozen + " dozen, and " + leftovers + " extra flash drives.");
		
		JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
	}

}
