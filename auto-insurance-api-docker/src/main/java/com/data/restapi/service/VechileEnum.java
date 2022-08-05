package com.data.restapi.service;

public enum VechileEnum {
	
	SUV(560.00), TRUCK(800.00), SEDAN(490.00), OTHER(1000.00);
	
	private double quote;
	
	VechileEnum(double d) {
		this.quote=d;
	}
	public double getQuote() {
		return quote;
	}
}