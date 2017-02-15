public abstract class lab_13toyclass
{
	private String name;
	private int count;
	
	public lab_13toyclass()
	{
		this.name = "";
		this.count = 1;
	}
	
	public lab_13toyclass(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public abstract String getType();
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public String toString()
	{
		return this.name + " " + this.count;
	}
}