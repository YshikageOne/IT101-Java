import java.util.Scanner;

public class CustomerBill {

	public static void main(String[] args) {
		//made by me Mr.Clyde Allen Yu :D
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the brand of your phone: ");
		String brand = input.next();
		
		System.out.print("Enter the color of your phone: ");
		String color = input.next();
		
		System.out.print("Enter the price of your phone: ");
		float price = input.nextFloat();
		
		System.out.print("Enter the quanitity: ");
		int quantity = input.nextInt();
		
		double GrossTotal,NetTotal,Vat;
		
		GrossTotal = price * quantity;
		Vat = GrossTotal * 0.038;
		NetTotal = GrossTotal + Vat;
		
		//Bill Printing
		System.out.println("------------------------------------------");
		System.out.println("Brand        : " + brand);
		System.out.println("Color        : " + color);
		System.out.println("Price        : $" + String.format("%,.2f", price));
		System.out.println("Quantity     : " + quantity);
		System.out.println("Gross Total  : $" + String.format("%,.2f", GrossTotal));
		System.out.println("Vat(3.8%)    : $" + String.format("%,.2f", Vat));
		System.out.println("Net Total    : $" + String.format("%,.2f", NetTotal));
		System.out.println("------------------------------------------");
		
		//payment
		System.out.print("How much will you pay on it? ");
		float payment = input.nextFloat();
		
		if(payment >= NetTotal) {
			double change = payment - NetTotal;
			
			System.out.println("Payment Recieved, here's the change: $" + String.format("%,.2f", change));
			System.out.println("--made by me Mr.Clyde Allen Yu :D");
		}
		else {
			System.out.println("Payment not enough");
		}
		
		
	}
}
