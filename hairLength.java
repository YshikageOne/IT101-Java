package week1laboratory2;

import javax.swing.JOptionPane;


public class hairLength {

	public static void main(String[] args) {
		//Number of hair strands
		int numHairStrands = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hair strands", "Hair Strands", JOptionPane.QUESTION_MESSAGE));
		
		//inputs the length in cm of the hair strands and gets the total length
		double totalLengthcm = 0;
		
		for(int i = 1; i <= numHairStrands; i++) {
			double cmLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the strand(in centimeters please...)", "Centimeter", JOptionPane.QUESTION_MESSAGE));
			totalLengthcm += cmLength;
		}
		
		//average hair length
		double hairLenAverage = totalLengthcm / numHairStrands;
		
		//total length in km and miles
		//1km = 100000cm = 0.62 miles
		
		double lengthkm = totalLengthcm / 100000;
		double lengthmile = totalLengthcm / 160934.4;
		
		//display results
		
		String results = ("Cory Khong has " + numHairStrands + " hair strands with an average length of " + hairLenAverage + " cm." + 
		                  "\nThe length of her hair is " + lengthkm + " km or " + lengthmile + " miles." + 
				          "\nmade by me Mr.Clyde Allen Yu :D");
		
		JOptionPane.showMessageDialog(null, results, "Hair", JOptionPane.INFORMATION_MESSAGE);

	}

}
