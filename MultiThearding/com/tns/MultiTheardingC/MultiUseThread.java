package MultiThearding.com.tns.MultiTheardingC;

class Eclipse extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse thread id is "+ Thread.currentThread().getId());
		}
	}
	
}

class PPT extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
		System.out.println("PPT thread id is "+ Thread.currentThread().getId());
		}
	}
	
}

class NotePad extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("NotePad thread id is "+ Thread.currentThread().getId());
		}
	}
	
}


public class MultiUseThread {
	
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();
		
		NotePad obj2  = new NotePad();
		obj2.start();
	}

}
