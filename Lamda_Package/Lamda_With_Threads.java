package Lamda_Package;

//interface display{
//	void pprin();
//}

public class Lamda_With_Threads {
	
	public static void main(String[] args) {
		
		new Thread(()->{System.out.println("This in lamba");}).start();
		
//		Thread t = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("This is first thread");
//				
//			}
//		});
//		
//		t.start();
	}

}
