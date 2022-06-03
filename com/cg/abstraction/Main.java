package com.cg.abstraction;

import java.util.Scanner;

abstract class Movie{
	
	abstract void setTitle(String s);
}

class MyMovie extends Movie{

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		
		System.out.println("The Title is : " + s);
		
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String title = in.nextLine();
		Movie myMovie = new MyMovie();
		myMovie.setTitle(title);
	}

}
