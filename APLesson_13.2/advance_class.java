public class advance_class extends tickets_superclass
{
	private int daysLeft;
	public advance_class()
	{
		super();
	}
	
	public advance_class(int dl)
	{
		super();
		daysLeft = dl;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}