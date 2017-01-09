import java.util.Scanner;
public class Lab_11_Divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][]nums = new int [4][4];
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				
				nums[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(nums[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number:");
		
		int divisor = kb.nextInt();
		int count = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			
			for(int j = 0; j < nums[i].length; j++)
			{
				
				if(nums[i][j]%divisor == 0)
					count += 1;
				
			}
			
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}