import java.util.Scanner;

public class Lab_03_EX_03
{
	public static void main (String[]args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How long is distance ? ");
		int d = keyboard.nextInt();
		
		System.out.println("How much time ? ");
		int t = keyboard.nextInt();
		
		int s = d/t;
		System.out.println("The speed is  "+ s);
		
	}
	
}