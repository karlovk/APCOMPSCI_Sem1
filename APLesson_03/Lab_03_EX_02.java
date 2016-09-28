import java.util.Scanner;

public class Lab_03_EX_02
{
	public static void main (String[]args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height ? ");
		int h = keyboard.nextInt();
		
		System.out.println("What is your weight ? ");
		int w = keyboard.nextInt();
		
		int HH = h * h ;
		int a = w / HH;
		int bmi = 703 * a;
		
		System.out.println("BMI is  " + bmi );
		
		
	}
}