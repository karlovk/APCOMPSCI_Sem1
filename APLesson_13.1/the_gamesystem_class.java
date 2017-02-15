public class the_gamesystem_class
{
	private String platform;
	private int serialNo;
	
	public the_gamesystem_class()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public the_gamesystem_class(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getserialNo()
	{
		return this.serialNo;
	}
}