package com.cg.AcessModifiers2;

import com.cg.AcessModifiers1.test1;

//ERROR BECAUSE EVEN EXTENDS CLASSES NOT ACCESS PRIVATE METHODS

public class test3 extends test1{
    public static void main(String[]args){
        test3 t3=new test3();
        t3.show();
        System.out.println(t3.i);
   }
}