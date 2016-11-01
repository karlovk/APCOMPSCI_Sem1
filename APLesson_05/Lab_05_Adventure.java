import java.util.Scanner;
public class Lab_05_Adventure
{
	
	static Scanner kb;
	
	
	public static void main (String[]args)
	{
		kb = new Scanner(System.in);
		recursion(); 
		
	}
	public static void recursion()
	{
		System.out.println("You appered on alone island, your plane crashed everyone is dead you need to get food where would you like to go? \n your choices \n 1-Try to find food on your plane \n 2-Try get out of the plane and eat some leafs or grass \n 3- Start eating dead people on the plane   ");
		int choice = kb.nextInt();
		
		if(choice == 1 )	
		{
			System.out.println("You found some cookies on the floor that were close to you ");
			System.out.println("Your next move?");
			System.out.println("1-Wait for rescue helicopter ");
			System.out.println("2-Try to go to the shore");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
					System.out.println("Rescue helicopter came after two days and saved you ");
	
			}
			else if (choice2 == 2)
			{
					System.out.println("Tiger Richard Parker just apperedin front of you and you see a white boat but ,\n tiger was too hungry he ate you");
	
			}
			
		}
		else if (choice == 2 )
		{
			System.out.println("You eat leafs and grass and it has a very bad taste");
			System.out.println("And then there was a big one foot big spider ");
			System.out.println("Your choices ");
			System.out.println("1-You grab a stick and try to kill it  ");
			System.out.println("2-Stand still");
			
			
			int choice3 = kb.nextInt();
			if (choice3 == 1)
			{
					System.out.println("You kiled spider and continued to live ");
	
			}
			else if (choice3 == 2)
			{
					System.out.println("Spider bit you and you died because of his poison");
			}
	
		}
		else if (choice == 3 )
		{
			System.out.println("You are canibal");	
			System.out.println("You tried to eat the skin but you realized that you have respect for people and you stopped");
			System.out.println("Your choices ");
			System.out.println("1-Let it be  ");
			System.out.println("2-Eat the forniture");
			
			
			int choice4 = kb.nextInt();
			if (choice4 == 1)
			{
					System.out.println("You died because you didnt eat anything  ");
	
			}
			else if (choice4 == 2)
			{
					System.out.println("The forniture had too many toxic chemicals and you died ");
			}
		}
		else
		{
		System.out.println("you didnt print 1 2 or 3 ");
			recursion(); 
		}
	}
	
	
	
}