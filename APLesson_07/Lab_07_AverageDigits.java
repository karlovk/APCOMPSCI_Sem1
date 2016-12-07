import java.util.Scanner;
public class Lab_07_AverageDigits
{
	static int dig = 0;
	static int number;
	static int ave = 0; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = kb.nextInt();
		aveDigits();
		System.out.println("The average of the digits in " + number + " is " + ave);
	}
	
	
	public static void aveDigits()
	{
		int num = number;
		while(num > 0)
		{
			dig += 1;
			ave+= num%10;
			num /= 10;
		}
		ave /= dig;
	}
	
	
}