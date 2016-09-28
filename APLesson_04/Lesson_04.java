public class Lesson_04
{
	public static void main(String[]args)
	{
		
		Lesson_04 receipt = Lesson_04();
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter item1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter price:"
		
		);
		String price1= kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item2:");
		String item2 = kb.nextLine();
		System.out.println("Please enter price:");
		String price2= kb.nextDouble();
		kb.nextLine();
      
		
		System.out.println("Please enter item3:");
		String item3 = kb.nextLine();
		System.out.println("Please enter price:");
		String price3= kb.nextDouble();
		kb.nextLine();
		
		System.out.println("<<<<<<<receipt>>>>>>>>");
		
		
		double subtotal = price1 + price2 + price3
	
		tax = subtotal * 0.08
		
		total = subtotal + tax 
		
		
	}
	
	
	
	public void format(String item, double price)
	{
		System.out.printf("", word, number);	
		
		
		receipt.format(item1, price1);
		
		receipt.format(item2, price2);
		  
		receipt.format(item3, price3);
		
		
		receipt.format("Subtotal:", subtotal);
		
		receipt.format("Tax:", tax);
		
		receipt.format("Total:", total);
		
	}
	
	
}