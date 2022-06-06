package Strings;

public class StringBuilder2 {
	
	public static void main(String[] args) {
		String Str = "Study";
		Str.concat("night");
		System.out.println(Str);
		
		StringBuilder str1 = new StringBuilder("Study ");
		str1.append("night");
		System.out.println(str1);
	}

}
