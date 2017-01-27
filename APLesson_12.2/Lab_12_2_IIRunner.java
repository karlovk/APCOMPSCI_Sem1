import java.util.Scanner;

public class Lab_12_2_IIRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the item manufacturer:");
		String man = kb.next();
		System.out.println("Please enter the item na:");
		String nam = kb.next();
		
		System.out.println("Will you be entering category and price information?");
		String choice = kb.next();
		if(choice.equals("n"))
		{
			Lab_12_2_InventoryItems object = new Lab_12_2_InventoryItems(man, nam);
			System.out.println(object);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter a category:");
			String cat = kb.next();
			System.out.println("Enter a price:");
			int pric = kb.nextInt();
			Lab_12_2_InventoryItems object1 = new Lab_12_2_InventoryItems(man, nam, cat, pric);
			System.out.println(object1);
		}
	}
}
