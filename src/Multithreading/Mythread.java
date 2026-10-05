package Multithreading;

public class Mythread  extends Thread{

	public void run() {
		
		
		try {

			for(int i=1;i<=10; i++) { 
				System.out.println("i for:"+i);
			
			Thread.sleep(2000);
			}
			
			System.out.println("thank you");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
	}
	
	public void whiles(int value) {
		int i=1;
		while(i++<value) {
			System.out.println("while :"+i);
		}
	}
	
}
