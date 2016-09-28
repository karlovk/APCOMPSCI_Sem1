import java.util.Scanner;//import Statement 

public class Lesson_03
{
	public static void main (String[]args )
	{
		//imnstantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input 
		System.out.println("How old are you ?");
		
		//search for the next integer that user enters 
		int num = keyboard.nextInt();
		
		//print the results ...
		System.out.println("Wow"+ num + " is perfect. You're good .");
	}
}