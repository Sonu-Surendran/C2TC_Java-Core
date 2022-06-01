package com.cg.inheritance;

public class Andorid extends Mobile{

	public Andorid(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
		// TODO Auto-generated constructor stub
	}
	
	public String getModel() {
		return "This is Andoridclass method "+ this.model;
	}

}
