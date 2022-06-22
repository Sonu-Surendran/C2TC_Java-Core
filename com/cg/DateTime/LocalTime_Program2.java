package com.cg.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime_Program2 {
	
	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatter = obj.format(form);
		
		System.out.println("formatted date "+ formatter);
		
	}


}
