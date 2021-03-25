package com.builderPattern;

public class MobileBuilder {
	
	private String os;
	private int batery;
	private String ram;
	private String processor;
	
	public MobileBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public MobileBuilder setBatery(int batery) {
		this.batery = batery;
		return this;
	}
	public MobileBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public MobileBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public Mobile getMobile() {
		return new Mobile(os, batery, ram, processor);
	}
	
}
