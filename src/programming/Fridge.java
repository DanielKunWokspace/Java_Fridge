package programming;

import java.util.ArrayList;

public class Fridge {
	private ArrayList<ItemToFridge> content;

	public Fridge() {
		this.content = new ArrayList<ItemToFridge>();

	}

	public void addItemToFridge(ItemToFridge item) {
		this.content.add(item);
	}

	public void getContentOfTheFridge() {
		for (int i = 0; i < content.size(); i++) {
			System.out.println(content.get(i));
		}

	}

	public void setExpDate(int expDay, int expMonth, int expYear) {
		for (int i = 0; i < this.content.size(); i++) {
			if (this.content.get(i).getItemExpYear() > expYear) {
				System.out.println(content.get(i).getItemName() + (" Is ok!"));
			} else if (this.content.get(i).getItemExpYear() == expYear) {
				if (this.content.get(i).getItemExpMonth() > expMonth) {
					System.out.println(content.get(i).getItemName() + (" Is ok!"));
				} else if (this.content.get(i).getItemExpMonth() == expMonth) {
					if (this.content.get(i).getItemExpDay() > expDay) {
						System.out.println(content.get(i).getItemName() + (" Is ok!"));

					} else if (this.content.get(i).getItemExpDay() == expDay) {
						System.out.println(("The ") + (this.content.get(i).getItemName()) + (" has expired today!"));
					}

					else {
						System.out.println(("The ") + (this.content.get(i).getItemName())
								+ (" has been deleted because it has expired"));
						this.content.remove(i);
						i--;
					}
				} else {
					System.out.println(("The ") + (this.content.get(i).getItemName())
							+ (" has been deleted because it has expired"));
					this.content.remove(i);
					i--;
				}
			} else {
				System.out.println(
						("The ") + (this.content.get(i).getItemName()) + (" has been deleted because it has expired"));
				this.content.remove(i);
				i--;
			}
		}
		System.out.println(" :D");
	}
}
