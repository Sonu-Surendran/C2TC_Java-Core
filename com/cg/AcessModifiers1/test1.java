package com.cg.AcessModifiers1;

public class test1{
private int i=10;
private void show(){
	System.out.println("Hello world");
}
    
    public static void main(String[]args){
        test1 t1=new test1();
        t1.show();
        System.out.println(t1.i);
   }
}