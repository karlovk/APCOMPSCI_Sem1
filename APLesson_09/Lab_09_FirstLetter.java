import java.util.Scanner;
public class Lab_09_FirstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words:");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		first(words);
	}
	public static void first(String[] words)
	{
		for(String word : words)
		{
			System.out.println(word.charAt(0));
		}
	}
}


