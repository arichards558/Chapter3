package exercises;
import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		double salary1;
		
		
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter Salary");
		  double salary  = inputDevice.nextDouble();
		  inputDevice.close();
		  predictRaise(salary);
		
		
		
		
		
		
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		
		

	}
	public static void predictRaise(double salary)
	{ 
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current Salary: " + salary + "   After raise: " + newSalary);

	

}
}
