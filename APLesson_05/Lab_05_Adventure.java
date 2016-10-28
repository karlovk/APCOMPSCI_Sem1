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
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{
					System.out.println("You eat leafs and grass and it has a very bad taste ");
	
			}
			else if (choice2 == 2)
			{
					System.out.println("abcd");
	
			}
			
		}
		else if (choice == 2 )
		{
			System.out.println("You eat leafs and grass and it has a very bad taste");
			System.out.println("And then there was a big one foot big spider ");
			System.out.println("Your choices ");
			System.out.println("1-You grab a stick and try to kill it  ");
			System.out.println("2-Stand still");
			System.out.println("3-Run away  ");
			
			int choice3 = kb.nextInt();
			if (choice3 == 1)
			{
					System.out.println("1 ");
	
			}
			else if (choice3 == 2)
			{
			System.out.println("2");
			}
	
		}
		else if (choice == 3 )
		{
				System.out.println("You are canibal");
		}
		else
		{
		System.out.println("you didnt print 1 2 or 3 ");
			recursion(); 
		}
	}
	
	
	
}