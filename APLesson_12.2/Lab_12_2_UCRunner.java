import java.util.Scanner;

public class Lab_12_2_UCRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String first = kb.next();
		System.out.println("Please enter your last name:");
		String last = kb.next();
		
		System.out.println("Would you like to use a public avatar?");
		String choice = kb.next();
		if(choice.equals("n"))
		{ //2 parameters- will use first constructor
			Lab_12_2_UserClass pH1 = new Lab_12_2_UserClass(first, last);
			System.out.println(pH1);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter your avatar name:");
			String avatar = kb.next();
			//3 parameters - will use second constructor
			Lab_12_2_UserClass pH2 = new Lab_12_2_UserClass(first, last, avatar);
			System.out.println(pH2);
		}
	}
}