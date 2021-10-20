package com.revature.models;

public class BoringTask extends Task{
	
	public void procrastinate() {
		
		this.setDueDate(this.getDueDate().plusDays(1));
		
	}

}
