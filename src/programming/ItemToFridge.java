package programming;

public class ItemToFridge {
	private String itemName;
	private int expirationDay;
	private int expirationMonth;
	private int expirationYear;
	
	public ItemToFridge(String item,int expirationDay,int expirationMonth, int expirationYear) {
		
			
			this.itemName = item;
			this.expirationDay = expirationDay;
			this.expirationMonth = expirationMonth;
			this.expirationYear = expirationYear;
			
	}
	public String getItemName() {
		return this.itemName;
		
	}
	public int getItemExpDay() {
		return this.expirationDay;
	}
	
	public int getItemExpMonth() {
		return this.expirationMonth;
		
	}
	public int getItemExpYear() {
		return this.expirationYear;
	}
	@Override
	public String toString() {
		return "[ItemName=" + itemName + ",ExpDay=" + expirationDay + ",ExpMonth="
				+ expirationMonth + ",ExpYear=" + expirationYear + "]";
	}
	
	

}
