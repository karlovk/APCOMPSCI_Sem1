import java.util.Scanner;
public class Lab_08_Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter first word:");
		String w1 = kb.next();
		
		System.out.println("Please enter second word:");
		String w2 = kb.next();
		
		System.out.println("Please enter third word:");
		String w3 = kb.next();
		
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
	public static String makeCenter(String word)
	{
		if(word.length() > 20)
			return word;
		else
			return makeCenter(" " + word + " ");
	}
}