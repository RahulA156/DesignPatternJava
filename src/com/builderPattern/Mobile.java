package com.builderPattern;

public class Mobile {

	private String os;
	private int batery;
	private String ram;
	private String processor;
	
	public Mobile(String os, int batery, String ram, String processor) {
		super();
		this.os = os;
		this.batery = batery;
		this.ram = ram;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Mobile [os=" + os + ", batery=" + batery + ", ram=" + ram + ", processor=" + processor + "]";
	}
	
	
	
}
