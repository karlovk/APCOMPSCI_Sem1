import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Lab_10_Express_Solv
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression: ");
		String expression = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
	}
	public static ArrayList<String> doEquation(ArrayList <String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(i < equation.size() && (equation.get(i).equals("*") || equation.get(i).equals("/")))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1))/Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}
		int k = 0;
		while(k < equation.size())
		{
			if(k < equation.size() && (equation.get(k).equals("+") || equation.get(k).equals("-")))
			{
				if(equation.get(k).equals("+"))
				{
					equation.set(k, "" + (Integer.parseInt(equation.get(k-1)) + Integer.parseInt(equation.get(k+1))));
				}
				else
				{
					equation.set(k, "" + (Integer.parseInt(equation.get(k-1)) - Integer.parseInt(equation.get(k+1))));
				}
				equation.remove(k-1);
				equation.remove(k);
			}
			else
				k++;
		}
		return equation;
	}
}
