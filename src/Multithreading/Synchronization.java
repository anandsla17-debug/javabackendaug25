package Multithreading;

public class Synchronization  extends SubSyn{
	
	
	synchronized void team1() throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			System.out.println("i=>s"+i);
			Thread.sleep(1000);			
		}
		
		wait();
		System.out.println("after => execute");
		
		
	}
	
	
synchronized void word() throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			System.out.println("word"+i);
			Thread.sleep(1000);
		}
		wait();
		System.out.println("after=> execute two");
		
		
	}
	
synchronized void aware() {
	notify();
	System.out.println("now thread is unlock");
}
	void team2() {
		for(int j=0; j<20;j++) {
			System.out.println("j=>n"+j);
			
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		Synchronization synchronization= new Synchronization();
		Thread thread = new Thread(()->{
			try {
				synchronization.team1();
			} catch (InterruptedException e) {
			
			}
		});
		Thread thread1= new Thread(()->{
			try {
				synchronization.word();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		});
		
		
		Thread thread2= new Thread(()->{
			synchronization.check();
		}); 
		
		
		thread.start();
		thread1.start();
		thread2.start();
	Thread.sleep(2000);
	Thread nofiy= new Thread(()->{
		synchronization.aware();
	});
	
	nofiy.start();
//	
		synchronization.team2();
		
		
	}
}
