public class Lab_12_1_HumanClass
{
	private String hair, eyes, skin;
	
	public Lab_12_1_HumanClass()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Lab_12_1_HumanClass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}