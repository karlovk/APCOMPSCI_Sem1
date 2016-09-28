import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 receipt = new Ex_02();
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
		
		System.out.println("*******************************************");
		receipt.format(item4, item5);
		receipt.format(item1, item2);
		receipt.format(item3, item6);
		System.out.println("*******************************************");
	}
	public void format(String item1, String item2)
	{
		System.out.printf("*%20s %20s*\n", item1, item2);	
	}
}
