import java.util.Scanner;
public class Lab_04_ex_02
{
	public static void main(String[]args)
	{
		//declare objects
		Lab_04_ex_02 receipt = new Lab_04_ex_02();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:  ");
		String item1 = kb.nextLine();
		
		System.out.println("Enter your last name:  ");
		String item2 = kb.nextLine();
		
		System.out.println("Enter your title:   ");
		String item3 = kb.nextLine();
		
		System.out.println("Enter the school site:   ");
		String item4 = kb.nextLine();
		
		System.out.println("Enter the school year:   ");
		String item5 = kb.nextLine();
		
		System.out.println("What is your subject?:   ");
		String item6 = kb.nextLine();
		
		System.out.println("***********************************");
		receipt.format(item4, item5);
		receipt.format(item1, item2);
		receipt.format(item3, item6);
		System.out.println("***********************************");
	}
	public void format(String item)
	{
		System.out.printf("* %10s %10.2f\n", item);	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}