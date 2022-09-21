package oop1;

//PascalCase
public class Product {

	// camesCase

	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStocks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStocks() {
		return unitsInStocks;
	}

	public void setUnitsInStocks(int unitsInStocks) {
		this.unitsInStocks = unitsInStocks;
	}

}
