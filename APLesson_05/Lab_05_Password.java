import java.util.Scanner;
public class Lab_05_Password
{
	static String pass;
	static String user;
	static String username;
	static String password;
	
	
     public static void main(String[]args )
	{
		
		username = "kosta";
		password = "karlov";
		passCheck();
		
	}

	public static void passCheck()
   {
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter your username and password");
	user = kb.next();
	pass = kb.next();
	
	
	if(user.equals (username) && pass.equals(password))
	{
		System.out.println("You are granted access! ");
	}
	
	else
	{
		if(user.equals(username) && pass !=(passwoed))
		{
			System.out.println("Your password is  incorrect!");
			passCheck();
		}	
		else if (pass.equals (password) && user !=(username))
		{
			System.out.println("Your username  is incorrect!");
			passCheck();
		
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}	
	}
}	
	
	
	
}