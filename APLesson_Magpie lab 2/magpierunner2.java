import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class magpierunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		magpie2 maggie = new magpie2();
		
		System.out.println (maggie.getGreeting());
		
		Scanner in = new Scanner (System.in);
		
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			
			statement = in.nextLine();
			
		}
		
	}

}