package com.cg.abstraction;

abstract class Bank{
	abstract int rateOfInterest();
}

class HDFC extends Bank{
	int rateOfInterest() {
		return 7;
	}
}

class SBI extends Bank{

	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}

public class Demo1 {
	
	public static void main (String[] args) {
		HDFC h = new HDFC();
		SBI s = new SBI();
		
		System.out.println("The rate of interest in HDFC is "+h.rateOfInterest());
		System.out.println("The rate of interest in SBI is "+s.rateOfInterest());
	}

}
