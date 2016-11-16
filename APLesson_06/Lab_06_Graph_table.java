import java.util.Scanner;
public class Lab_06_Graph_table
{
	public static void main (String[]args)
	{
		
		Scanner kb =  new Scanner(System.in);
		System.out.println("Please enter your integer:");
		int integer = kb.nextInt();
		
		System.out.println("Please enter number of rows:");
		int rows = kb.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
		System.out.println(i + "|" + i*rows );
		}
		
	}
	
}