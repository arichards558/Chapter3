package exercises;
import java.util.Scanner;
public class percentages {

	public static void main(String[] args) {
		double gradePercentage = 100.0;
		double gradePointAverage = 20.0;
		computePercent(gradePercentage, gradePointAverage);

	}
	
	public static void computePercent(double gradePercentage, double gradePointAverage)
	{
		double newGradePercentage;
		double newGradePointAverage;
		newGradePointAverage = gradePercentage * .20;
		newGradePercentage = gradePercentage / 20 * 100;
		System.out.println("100 is " + newGradePercentage + " percent of 20 "   + "and 20 is " + newGradePointAverage + " percent of 100 " );
		
		
		
	}
}

