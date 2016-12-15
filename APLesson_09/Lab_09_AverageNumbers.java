import java.util.Scanner;
public class Lab_09_AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i <= numbers.length - 1; i++)
			numbers[i] = (int)(Math.random() * 100) + 1;
		
		System.out.println("Numbers...");
		
		for(int num : numbers)
			System.out.print(num + " ");
		
		System.out.println();
		
		System.out.println("The average of the numbers is..." + average(numbers));
	}
	public static int average(int[] numbers)
	{
		int average = 0;
		for(int num : numbers)
			average += num;
		
		return average/numbers.length;
	}
}
