import java.util.Scanner;
public class Lab_09_1_FindTheZs
{
	static String [] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray(words);
		System.out.println("For the words");
		
		printArray(words);
		System.out.println("Only" + hasZs(words) + "contain(s) the letter z.");
		
	}
	public static void fillArray(String [] words)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words:");
		for(int i = 0; i < words.length; i++)
		{
			
			words[i] = kb.next();
		}
	}
	public static void printArray(String [] words)
	{
		for(String word : words)
			System.out.println(word + " ");
	}
	public static String hasZs(String [] words)
	{
		String zs = " ";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
				zs += (word + " ");
		}
		return zs;
	}
}