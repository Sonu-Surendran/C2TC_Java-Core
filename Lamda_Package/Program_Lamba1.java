package Lamda_Package;


interface lamda{
	void display();
}

public class Program_Lamba1 {
	
	public static void main(String[] args) {
		lamda obj = ()->{
			System.out.println("Hello CID women");
		};
		obj.display();
	}

}
