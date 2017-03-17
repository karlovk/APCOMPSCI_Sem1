import java.util.Arrays;
import java.util.ArrayList;
public class toyota extends thecarclass
{
	public toyota(String position)
	{
		super();
		ArrayList<String> pos = new ArrayList<>(Arrays.asList(position.split(", ")));
		
		Double positionX = Double.parseDouble(pos.get(0)), positionY = Double.parseDouble(pos.get(1));
		
		super.move(positionX, positionY);
	}
}