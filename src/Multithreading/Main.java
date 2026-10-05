package Multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException { 
	Mythread mythread= new Mythread();
	mythread.setPriority(Thread.MIN_PRIORITY);
	
	mythread.start();
	

	
	
	Thread object=new Thread() {
		@Override
		public void run() {
			System.out.println("hello");
		}
	};
	
	object.start();
	
	// run =>   1to 5  => increm
	// 5 to 10=> decre
	// method => normal => "it is not 
	
	
	
	// runnable lambda
	
	Runnable team= ()->{
		for(int i=0; i<20;i++) {
			System.out.println("runable"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
		}
		}
	};
	

	
	
	Thread mains= new Thread(team);
	mains.setPriority(Thread.MAX_PRIORITY);
	mains.start();
	if(mythread.isAlive()) {
		System.out.println("it is alive");
	}
	
	mythread.join();

	mythread.whiles(10);
	
	
	}
}
