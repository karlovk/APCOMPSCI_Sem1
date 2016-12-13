import java.util.Scanner;
public class Lab_08_TreeDeg60
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		
		int start = 1;
		int stop = word.length();
		tree(word, start, stop);
	}
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%10s\n", word.substring(0, start));
			start += 1;
			tree(word, start, stop);
		}
	}
}
	
	
