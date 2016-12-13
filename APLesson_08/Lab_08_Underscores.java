import java.util.Scanner;
public class Lab_08_Underscores
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
		
	}
	public static String replace(String sentence)
	{
		int num = sentence.indexOf(" ");
		if(num < 0)
			return sentence;
		
		else
			return replace(sentence.substring(0, num) + "_" + sentence.substring(num + 1));
		
	}
}