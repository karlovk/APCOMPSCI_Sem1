import java.util.Arrays;
public class honda implements location
{
	
	private double[] loca;
	
	public honda()
	{
		
		loca = new double[2];
		
	}
	
	public honda(double[] L)
	{
		
		loca = new double[2];
		loca = L;
		
	}
	
	public int getID()
	{
		
		return (int)(Math.random() * 1000000) + 1;
		
	}
	
	public void move(double ex, double why)
	{
		
		loca[0] = ex;
		loca[1] = why;
		
	}
	
	public double[] getLoc()
	{
		
		return loca;
		
	}
	
}