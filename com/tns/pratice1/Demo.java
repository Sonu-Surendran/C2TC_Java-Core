package com.tns.pratice1;

import com.tns.pratice2.Demo2;

public class Demo {
	
	public static void main(String[] args) {
		Demo2 obj = new Demo2(101,"Ronny",78000);
		Demo2 emp = new Demo2(102,"Shiva",67000);
		Demo2 emp1 = new Demo2(103,"Marry",23000);
		Demo2 emp2 = new Demo2(104,"Laya",79000);
		
		obj.display();
		emp.display();
		emp1.display();
		emp2.display();
		
	}

}
