import java.util.Arrays;
public class thecarclass implements location
{
	private final int ID;
	
	private double[] location = new double[2];
	
	public thecarclass()
	{
		
		ID = (int)(Math.random() * 1000000) + 100000;
		
	}
	
	public void move(double X, double Y)
	{
		
		location[0] += X;
		
		location[1] += Y;
		
	}
	
	public int getID()
	{
		
		return ID;
		
	}
	
	public double[] getLoc()
	{
		
		return location;
		
	}
}