import java.util.Scanner;
public class Lab_05_Password
{
	static String pass;
	static String user;
	static String kb;
	
     public static void main(String[]args )
	{
		
		kb = new Scanner(System.in);
		pass = "password";
		user = "username";
		passCheck();
		
	}

	public static void passCheck()
   {
	System.out.println("Enter the username and password");
	String guess1 = kb.next();
	String guess2 = kb.next();
	
	if((guess1.equals(user)) && (guess2.equals(pass)))
	{
		System.out.println("You are succesfully loged in ");
	}
	
	else
	{
		if(guess1!=user && guess2.equals(pass))
		{
			System.out.println("Your username is incorrect");
			passCheck();
		}	
		else if (guess2!=user && guess1.equals(pass))
		{
			System.out.println("Your password is incorrect");
			passCheck();
		
		}
		else
		{
			System.out.println("Your username and password are incorrect");
			passCheck();
		}	
	}
}	
	
	
	
}