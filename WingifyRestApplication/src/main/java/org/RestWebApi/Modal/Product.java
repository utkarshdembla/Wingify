package org.RestWebApi.modal;


public class Product {

	private long id;
	private String productName;
	private String category;
	private String brand;
	private String color;
	
	public Product()
	{
		
	}
	
	public Product(long id,String productName,String category,String brand,String color)
	{
		this.id=id;
		this.productName=productName;
		this.category=category;
		this.brand=brand;
		this.color=color;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
