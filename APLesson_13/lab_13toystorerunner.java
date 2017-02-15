import java.util.Scanner;
public class lab_13toystorerunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a list of toys: ");
		String list = kb.nextLine();
		lab_13toysore store = new lab_13toysore(list);
		System.out.println(store);
		System.out.println(store.getMostFrequentToy());
		System.out.println(store.getMostFrequentType());
	}
}