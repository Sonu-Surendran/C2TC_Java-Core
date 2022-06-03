package com.cg.abstraction;

abstract class Bike{
	abstract void run();
}

class Honda extends Bike{
	void run() {
		System.out.println("It is running safely");
	}
}

public class Demo {
	
	public static void main(String[] args) {
		
		Honda obj = new Honda();
		obj.run();
		
	}

}
