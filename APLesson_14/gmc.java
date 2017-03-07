import java.util.Arrays;
public class gmc implements location
{
	
	private double x, y;
	
	public gmc()
	{
		
		x = 0;
		y = 0;
		
	}
	
	
	public gmc(double X, double Y)
	{
		
		x = X;
		y = Y;
		
	}
	
	public int getID()
	{
		
		return (int)(Math.random() * 1000000) + 1;
		
	}
	
	public void move(double X, double Y)
	{
		
		x += X;
		y += Y;
		
	}
	
	public double[] getLoc()
	{
		
		double[] loc = new double[2];
		
		loc[0] = x;
		
		loc[1] = y;
		return loc;
		
	}
	
}