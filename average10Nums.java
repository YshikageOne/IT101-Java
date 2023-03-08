package week1laboratory2;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

//made by me Mr.Clyde Allen Yu :D
public class average10Nums {

	public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int inputNum;
        float average;
        
        List<Integer> numList  = new LinkedList<>();

        //while loop to get the 10 numbers and adding them together
        while(i < 10) {
	         inputNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number", "hmmmm", JOptionPane.QUESTION_MESSAGE));
	         numList.add(inputNum);
	         sum += inputNum;
	         i++;
        }

        //getting the average
        average = (float)sum / 10;

        //display the result
        String result = (numList + "\nYour average is " + average + "\nmade by me Mr.Clyde Allen Yu :D");

        JOptionPane.showMessageDialog(null, result, "Average Result", JOptionPane.INFORMATION_MESSAGE);
  	
	}
}
