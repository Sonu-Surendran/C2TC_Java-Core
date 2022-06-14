package MultiThearding.com.tns.MultiTheardingC;


class Ecli extends Thread{
	
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Eclipse thread id "+ Thread.currentThread().getId());
		
		try {
			sleep(1000);
		}catch(Exception f){
			System.out.println(f);
		}
	}
	}
}

public class MultiThreadSleep {
	
	public static void main(String[] args) {
		Ecli obj = new Ecli();
		obj.start();
	}

}
