package java_8_Feature;

public class Main {

	public static void main(String[] args) {
		Hero nabel = new Hero();
		Villain vital_prince = new Villain();
		
		System.out.println("Hero\n");
		
		nabel.act();
		nabel.comedy();
		nabel.speak();
		
		System.out.println("\nVillain\n");
		
		vital_prince.act();
		vital_prince.comedy();
		vital_prince.speak();
	}

}
