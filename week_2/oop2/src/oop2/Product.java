package oop2;
//PascalCase iki harf de büyük
public class Product {
//ürünün özelliklerini tanımlayacak ortam
	private String name;
	//camelCase
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unıtsInStock;
	// get okumak set yazmak
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
	public int getUnıtsInStock() {
		return unıtsInStock;
	}
	public void setUnıtsInStock(int unıtsInStock) {
		this.unıtsInStock = unıtsInStock;
	}


}

//private sadece bu classın içerisiinde kullanılabilir.