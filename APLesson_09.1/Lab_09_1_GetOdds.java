public class Lab_09_1_GetOdds
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers...");
		//bush did 9-11
		printArray(numbers);
		
		System.out.println("\nThe" + getOdds(numbers) + "are odd numbers");
	}
	public static void fillArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 100) + 1;
	}
	public static void printArray(int [] numbers)
	{
		for(int num : numbers)
			System.out.print(num + " ");
	}
	public static String getOdds(int [] numbers)
	{
		String odds = " ";
		for(int num : numbers)
		{
			if(num%2 == 1)
				odds += (num + " ");
		}
		return odds;
	}
}