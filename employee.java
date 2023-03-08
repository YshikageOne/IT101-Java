package week1laboratory2;

import javax.swing.JOptionPane;

//made by me Mr.Clyde Allen Yu :D
public class employee {

	public static void main(String[] args) {
		
		//initialize the variables
		 double SSS = 175.89;	
	     int PhilHealth = 300;
	     int gross, ratePerHour,hoursWorked,absences,late;
	     double totalDeduction,net;
	     
	     //inputs
	     ratePerHour = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your rate per hour?", "Rate per Hour", JOptionPane.QUESTION_MESSAGE));
	     hoursWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours you've spent working?", "Hours Worked", JOptionPane.QUESTION_MESSAGE));
	     absences = Integer.parseInt(JOptionPane.showInputDialog(null, "How many days were you absent?", "Absent", JOptionPane.QUESTION_MESSAGE));
	     late = Integer.parseInt(JOptionPane.showInputDialog(null, "Hours Late?", "Late", JOptionPane.QUESTION_MESSAGE));
	     
	     //calculation
	     gross = ratePerHour * hoursWorked;
    	 totalDeduction = (absences*5.75) + (late*3.25) + SSS + PhilHealth;
    	 net = gross - totalDeduction;
	     
    	 //displaying the output
	     String output = ("You've worked for " + hoursWorked + " hours with the rate of " + ratePerHour + " per hour with " + 
                          absences + " times absent and " + late + " hours late." + "\nSo your final pay is $" + String.format("%.2f", net));
	     
	     JOptionPane.showMessageDialog(null, output, "FINAL PAY!!", JOptionPane.INFORMATION_MESSAGE);

	}

}
