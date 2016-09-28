import java.util.Scanner;
public class Lab_04_Exx_01
{
	public static void main(String[]args)
	{
		
		Lab_04_Exx_01 receipt = new Lab_04_Exx_01();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		
		
		kb.nextLine();
		System.out.println("Please enter item2: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		
      
		kb.nextLine();
		System.out.println("Please enter item3: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter price: ");
	    double price3 = kb.nextDouble();
		
		
	
		
		
		double subtotal = (price1 + price2 + price3);
	
		double tax = (subtotal * 0.08);
		
		double total = (subtotal + tax);
		
		System.out.println("<<<<<<<receipt>>>>>>>>");
		
		receipt.format(item1, price1);
		
		receipt.format(item2, price2);
		  
		receipt.format(item3, price3);
		
		
		
		
		
		receipt.format("Subtotal:", subtotal);
		
		receipt.format("Tax:", tax);
		
		receipt.format("Total:", total);
		
		
		System.out.println("\n ______________________________\n* Thank you for your support * ");
		
		
	}
	
	
	
	public void format(String item, double price)
	{
		System.out.printf(" \n*%10s %10.2f ", item, price);	
		
		
	}
	
}