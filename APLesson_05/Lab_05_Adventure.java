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
		System.out.println("You appered on alone island, your plane crashed everyone is dead ");
		int choice = kb.nextInt();
		
		if(choice == 1 )	
		{
			System.out.println("sadadas");
			
			
		}
		else if (choice == 2 )
		{
			System.out.println("jsaljgfhsaof");
	
		}
		else if (choice == 3 )
		{
				System.out.println("jsaljgfhsaof");
		}
		else
		{
		System.out.println("you didnt print a b or c ");
			recursion(); 
		}
	}
	
	
	
}