package com.cg.AcessModifiers2;

import com.cg.AcessModifiers1.test1;

// error because private is only accessible with in the same class

public class Test4{
    public static void main(String[]args){
        test1 t1=new test1();
        t1.show();
        System.out.println(t1.i);
    }
}