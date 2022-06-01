package Java_Basic;

import java.util.Scanner;

public class Scanner_Input {
	
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String name=in.nextLine();
		int age=in.nextInt();
		float fee = in.nextFloat();
		long phoneNo = in.nextLong();
		char gender=in.next().charAt(0);
		
		
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("fee: "+fee);
		System.out.println("phoneNo: "+phoneNo);
		System.out.println("Gender: "+gender);
		
	}

}
