import java.util.Scanner;
public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main (String[]args )
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter lenght: ");
		l = kb.nextDouble();
		
		System.out.println("Please enter width: ");
		 w = kb.nextDouble();
		
		
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{
		perimeter = 2 * (l + w);
		
		
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + perimeter +"ft around.");
		
	}
}