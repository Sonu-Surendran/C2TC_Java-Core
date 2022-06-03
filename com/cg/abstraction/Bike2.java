package com.cg.abstraction;

abstract class Bikes{
	Bikes(){
		System.out.println("Bike is created ");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear changed ");
	}
}

class Hondas extends Bikes{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("The bike is running safely ");
	}
	
}

public class Bike2 {
	
	public static void main (String[] args) {
		
		Hondas h = new Hondas();
		h.run();
		h.changeGear();
		
	}

}
