
import java.util.Scanner;

public class MakeChangeProject {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		double itemAmount, tenderedAmount;

		System.out.print("Please enter the item amount: ");
		itemAmount = keyboard.nextDouble();

		System.out.print("Please enter the tendered amount: ");
		tenderedAmount = keyboard.nextDouble();

		makeChange(itemAmount, tenderedAmount);

	}

	public static void makeChange(double itemAmount, double tenderedAmount) {

		double hundred = 0, twenty = 0, ten = 0, five = 0, one = 0;
		double quarter = 0, dime = 0, nickel = 0, penny = 0;
		double change = 0;

		if (itemAmount < tenderedAmount) {

			change = tenderedAmount - itemAmount;
			System.out.println("Change: $" + String.format("%.2f", change) + "\n");

			if (change >= 100) {
				hundred = change / 100;
				change = change % 100;
			}
			if (change >= 20) {
				twenty = change / 20;
				change %= 20;
			}
			if (change >= 10) {
				ten = change / 10;
				change %= 10;
			}
			if (change >= 5) {
				five = change/5;
				change %= 5;
			}
			if (change >= 1) {
				one = change/1;
				change %= 1;
			}
			if (change >= .25) {
				quarter = change / .25;
				change %= .25;
			}
			if (change >= .1) {
				dime = change / .1;
				change %= .1;
			}
			if (change >= .05) {
				nickel = change / .05;
				change %= .05;
			}
			if (change >+ .01) {
				penny = (change+0.005)/.01;
			}
		}
		else if (itemAmount == tenderedAmount) {
			System.out.println("Tendered the exact amount as item price.");
		}
		else
			System.out.println("Error");

		if (hundred != 0)
			System.out.println("Hundreds: " + (int) hundred);
		if (twenty != 0)
			System.out.println("Twenties: " + (int) twenty);
		if (ten != 0)
			System.out.println("Tens: " + (int) ten);
		if (five != 0)
			System.out.println("Fives: " + (int) five);
		if (one != 0)
			System.out.println("Ones: " + (int) one);
		if (quarter != 0)
			System.out.println("Quarters: " + (int) quarter);
		if (dime != 0)
			System.out.println("Dimes: " + (int) dime);
		if (nickel != 0)
			System.out.println("Nickels: " + (int) nickel);
		if (penny != 0)
			System.out.println("Pennies: " + (int) penny);
	}

}
