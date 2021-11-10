package com.revature.models;

public class Soda {
	
	private int id;
	private String name;
	private String brand;
	private String flavor;
	private int quantity;
	private boolean isDiet;
	private boolean inStock;
	
	public Soda() {
		super();
	}
	
	public Soda(Integer id, String name, String brand, Integer quantity, String flavor, Boolean isDiet, Boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.flavor = flavor;
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
