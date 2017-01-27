public class Lab_12_2_InventoryItems
{
	private String manufacturer, name, category;
	private int UPC, price;
	
	public Lab_12_2_InventoryItems(String manu, String na)
	{
		manufacturer = manu;
		name = na;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public Lab_12_2_InventoryItems(String manu, String na, String categ, int pri)
	{
		manufacturer = manu;
		name = na;
		category = categ;
		price = pri;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public String toString()
	{
		return "Inventory Items...\nItem Manufacturer: " + manufacturer +
                           "\nItem Name: " + name +
                           "\nItem Category: " + category +
                           "\nItem Price: " + price + "\nUPC: " + UPC;
	}
}

