import java.util.Scanner;
public class Lab_06_1_countbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a count:");
		int num = kb.nextInt();
		
		System.out.println("Please enter a interval: ");
		int inter = kb.nextInt();
		System.out.println();
		for (int i = 1 ; i * inter <= num; i++)
		{
			System.out.println(i*inter);
		}
	}
	
}