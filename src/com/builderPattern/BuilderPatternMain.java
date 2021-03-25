package com.builderPattern;

public class BuilderPatternMain {

	public static void main(String[] args) {
			
		Mobile mb=new MobileBuilder().setOs("Android").setBatery(4000).setProcessor("Qualcom520").setRam("4GB").getMobile();
		Mobile mb2=new MobileBuilder().setOs("Ios").getMobile();
		
		System.out.println(mb);
		System.out.println(mb2);
	}

}
