package com.revature.models;

public class Soda {
	
	private String name;
	private String brand;
	private String flavor;
	private boolean isDiet;
	
	public Soda() {
		super();
	}
	
	public Soda(String name, String brand, String flavor, Boolean isDiet) {
		super();
		this.name = name;
		this.brand = brand;
		this.flavor = flavor;
		this.isDiet = isDiet;
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

	public boolean isDiet() {
		return isDiet;
	}

	public void setDiet(boolean isDiet) {
		this.isDiet = isDiet;
	}
	

}
