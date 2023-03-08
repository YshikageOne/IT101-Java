package week1laboratory2;

import javax.swing.JOptionPane;

//made by me Mr.Clyde Allen Yu :D
public class twoNumbers {
	public static void main(String[] args) {

		int firstNumber, secondNumber;
		//Input
		
		firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first number", "hmmmm", JOptionPane.QUESTION_MESSAGE));
		
		secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your second number", "hmmmm", JOptionPane.QUESTION_MESSAGE));
		
		//Operations
		int sum, difference, product;
		float quotient;
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		product = firstNumber * secondNumber;
		quotient = ((float)firstNumber)/secondNumber;
		
		//Displaying the results
		String result =  (firstNumber + " + " + secondNumber + " = " + sum + 
				         "\n" + firstNumber + " - " + secondNumber + " = " + difference + 
				         "\n" + firstNumber + " * " + secondNumber + " = " + product +
				         "\n" + firstNumber + " / " + secondNumber + " = " + quotient + 
				         "\nmade by me Mr.Clyde Allen Yu :D");
		
		
		JOptionPane.showMessageDialog(null, result, "RESULTS ARE IN", JOptionPane.PLAIN_MESSAGE);
	}

}
