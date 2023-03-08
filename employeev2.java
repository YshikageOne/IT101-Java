package week1laboratory2;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class employeev2 {
	 public static void main(String[] args) {
		 //initializing the values and making the multiple input layout
		 JPanel layout = new JPanel(new GridLayout(4,4));
		 JTextField answer1 = new JTextField();
		 JTextField answer2 = new JTextField();
		 JTextField answer3 = new JTextField();
		 JTextField answer4 = new JTextField();
		 
	     double SSS = 175.89;	
	     int PhilHealth = 300;
	     int gross;
	     double totalDeduction,net;
	     
	     layout.add(new JLabel("What is your rate per hour?"));
	     layout.add(answer1);
	     
	     layout.add(new JLabel("How many hours you've spent working?"));
	     layout.add(answer2);
	     
	     layout.add(new JLabel("How many days were you absent?"));
	     layout.add(answer3);
	     
	     layout.add(new JLabel("Hours late?"));
	     layout.add(answer4);
	     
	     //displaying the input prompt
	     int result = JOptionPane.showConfirmDialog(null, layout, "Answer the questions pls", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	     
	     //once the input is in
	     if (result == JOptionPane.OK_OPTION) {
	    	 int ratePerHour = Integer.parseInt(answer1.getText());
	    	 int hoursWorked = Integer.parseInt(answer2.getText());
	    	 int absences = Integer.parseInt(answer3.getText());
	    	 int late = Integer.parseInt(answer4.getText());
	    	 
	    	 gross = ratePerHour * hoursWorked;
	    	 totalDeduction = (absences*5.75) + (late*3.25) + SSS + PhilHealth;
	    	 net = gross - totalDeduction;
	    	 
	      //displaying the output
		     String output = ("You've worked for " + hoursWorked + " hours with the rate of " + ratePerHour + " per hour with " + 
	                          absences + " times absent and " + late + " hours late." + "\nSo your final pay is $" + String.format("%.2f", net));
		     
		     JOptionPane.showMessageDialog(null, output, "FINAL PAY!!", JOptionPane.INFORMATION_MESSAGE);
	        }
	 }

}
