public class studentadvance_class extends advance_class 
{
	public studentadvance_class()
	{
		super();
	}
	
	public studentadvance_class(int dl)
	{
		super(dl);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n Price: " + getPrice() + "\nSTUDENT ID REQUIRED";
	}
}