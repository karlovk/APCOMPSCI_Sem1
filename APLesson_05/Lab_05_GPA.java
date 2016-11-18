import java.util.Scanner;
public class Lab_05_GPA
{
	
	static String Math;
    static String English;
	static String Science;
	static String Government; 
	static String Economics;
	static String APCOMPSI;
	static String PE;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your Math grade");
		Math = kb.next();
		
		System.out.println("Please enter your English grade");
		English = kb.next();	
		
		System.out.println("Please enter your Science grade");
		Science = kb.next();	
		
		System.out.println("Please enter your Government grade");
		Government = kb.next();	
		
		System.out.println("Please enter your Economics grade");
		Economics = kb.next();	
		
		System.out.println("Please enter your Ap Computer Science grade");
		APCOMPSI = kb.next();	
		
		System.out.println("Please enter your PE grade");
		PE = kb.next();

		double gPoints = calcPoints(Math) + calcPoints(English) + calcPoints(Science) + calcPoints(Government) + calcPoints(Economics) + calcPoints(APCOMPSI) + calcPoints(PE);
	
		double GPA = gPoints/7;
		System.out.println("Your GPA is " + GPA);
		
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals ("a"))
		{
			return 4;
		}
		
		if (grade.equals ("b"))
		{
			return 3;
		}
		
		if (grade.equals ("c"))
		{
			return 2;
		}
		
		if (grade.equals ("d"))
		{
			return 1;
		}
		
		else 
		{
			return 0;
		}
		
	}
	
	
}