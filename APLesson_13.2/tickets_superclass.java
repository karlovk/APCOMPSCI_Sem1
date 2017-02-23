public abstract class tickets_superclass
{
	private int serialNo;
	private double Price;
	
	public tickets_superclass()
	{
		serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + this.serialNo + "\n Price: " + this.getPrice();
	}
}