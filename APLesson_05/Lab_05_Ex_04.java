import java.util.Scanner;
public class Lab_05_Ex_04
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height ? ");
		double h = keyboard.nextInt();
		
		System.out.println("What is your weight ? ");
		double w = keyboard.nextInt();
		
		double HH = h * h ;
		double a = w / HH;
		double bmi = 703 * a;
		
		System.out.println("Your BMI is:" + bmi);
		String condition = calcCondish(bmi);	
		System.out.println("You are " + condition);
		
		
	}
	public static String calcCondish(double bmi)
	{
		if(bmi > 40)
			return "Morbildy Obese";
		
		else if (bmi > 34.9)
			return "Very Obese";
		
		else if (bmi > 29.9)
			return "Obese";
		
		else if (bmi > 24.9)
			return "Overweight";
		
		else if (bmi > 18.5)
			return "Condition is Normal";
		
		else
			return "Condition is Underweight";

		
	}
	
	
}