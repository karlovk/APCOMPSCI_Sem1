import java.util.Scanner;
public class Ex_03
{
	
	public static void main(String[]args)
	{
		RetMethods average = new RetMethods();
		int rate = 12;
		int principal = 34;
		int time = 56;
		int number = 78;
		
		
		System.out.println("Your monthly will be" + payment(rate, principal, number, time));
		
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return ( p * ( Math.pow(1+r/n, n*t)))/(t*12);
		
	}
	
	
}