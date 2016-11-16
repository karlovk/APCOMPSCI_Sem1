import java.util.Scanner;
public class Lab_06_Song 
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	public static double sing (String word, int num)
	{
		for (int i = 1; i <= num; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println("");
		return(6);
	}
}
