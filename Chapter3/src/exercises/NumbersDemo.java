package exercises;
import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		int numberOfPeople;
		int numberOfSteaks;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter number of people");
		int people = inputDevice.nextInt();
		System.out.print("Enter number of Steaks");
		int steaks = inputDevice.nextInt();
		inputDevice.close();
		
		displayTwiceTheNumber(people, steaks);
		displayNumberPlusFive(people, steaks);
		displayNumberSquared(people, steaks);
		}
	public static void displayTwiceTheNumber(int numberOfPeople, int numberOfSteaks)
	{
		int newPeople;
		int newSteaks;
		final int multiplier = 2;
		 newPeople = numberOfPeople * multiplier;
		 newSteaks = numberOfSteaks * multiplier; 
		 System.out.println("Current number of people " + newPeople + " and current number of steaks " + newSteaks);
		}
	public static void displayNumberPlusFive(int numberOfPeople, int numberOfSteaks)
	{
		int newPeople;
		int newSteaks;
		final int addition = 5;
		newPeople = numberOfPeople + addition;
		newSteaks = numberOfSteaks + addition;
		System.out.println("Current number of steaks plus five is " + newSteaks + " and current number of people plus five is " + newPeople);
}
	public static void displayNumberSquared(int numberOfPeople, int numberOfSteaks)
	{ 
		int newPeople;
		int newSteaks;
		final int square = numberOfPeople;
		final int squared2 = numberOfSteaks;
		newPeople = numberOfPeople * square;
		newSteaks = numberOfSteaks * squared2;
		System.out.println("Current number of steaks squared is " + newSteaks + " and the current number of people squared is " + newPeople);
}
}
