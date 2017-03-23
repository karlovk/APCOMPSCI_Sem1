import java.util.Scanner;
import java.util.ArrayList;

public class lab_13toyrunner
{
	public static void main (String[]args)
	{
		ArrayList<lab_13toyclass> toy = new ArrayList<lab_13toyclass>();
		toy.add(new lab_13afigure("Superman"));
		toy.add(new lab_13carclass("Ferrari"));
		
		for(lab_13toyclass x : toy)
		{
			System.out.println(x);
		}
	}
	
}
	