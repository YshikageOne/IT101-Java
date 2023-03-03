import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCircumferenceCircle {
//made by me Mr.Clyde Allen Yu :D
	private static final DecimalFormat twoDeciPlaces = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of your circle: ");
		int radius = input.nextInt(); 
		
		System.out.println("Area: " + twoDeciPlaces.format(Area(radius)));
		System.out.println("Circumference: " + twoDeciPlaces.format(Circumference(radius)));
		System.out.println("-made by me Mr.Clyde Allen Yu :D");

	}
	
	public static double Circumference(int radius) {
		//Circumference = 2 * pi * r
		double circumference;
		double pi = 3.14;
		circumference = 2 * pi * radius;
		return circumference;
	}

	public static double Area(int radius) {
		//Area  = pi * r^2
		double area;
		double pi = 3.14;
		double radSquared = Math.pow(radius,2);
		area = pi * radSquared;
		
		return area;
	}
}
