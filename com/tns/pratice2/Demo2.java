package com.tns.pratice2;

public class Demo2 {
	
	int emp_id;
	String name;
	float salary;
	
	public Demo2(int id,String name,float salary){
		this.emp_id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: "+name+" Employee ID: "+ emp_id);
	}

}
