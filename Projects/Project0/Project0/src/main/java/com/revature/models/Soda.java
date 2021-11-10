package com.revature.models;

public class Soda {
	
	private int id;
	private String name;
	private String brand;
	private String flavor;
	private int quantity;
	private int price;
	private boolean isDiet;
	private boolean inStock;
	
	public Soda(int id, String name, String brand, String flavor, int quantity, int price, boolean instock) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.flavor = flavor;
		this.quantity = quantity;
		this.price = price;
		this.inStock = inStock;
	}
	
	public Soda(String name, String brand, String flavor, Integer quantity, Integer price,boolean instock) {
		super();
		this.name = name;
		this.brand = brand;
		this.flavor = flavor;
		this.quantity = quantity;
		this.price = price;
		this.inStock = inStock;
		
	}
	
	public Soda(Integer id, String name, String brand, Integer quantity,Integer price, String flavor, Boolean isDiet, Boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.flavor = flavor;
		this.price = price;
		this.quantity = quantity;
		this.isDiet = isDiet;
		this.inStock = inStock;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDiet() {
		return isDiet;
	}

	public void setDiet(boolean isDiet) {
		this.isDiet = isDiet;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	

}
