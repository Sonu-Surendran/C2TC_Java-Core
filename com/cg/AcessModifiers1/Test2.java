package com.cg.AcessModifiers1;

public class Test2{
    
	//Error because i and show function are private in test1 class
	
	public static void main(String[]args){
        test1 t1=new test1();
        t1.show();
        System.out.println(t1.i);
    }