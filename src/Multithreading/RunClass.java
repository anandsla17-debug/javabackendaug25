package Multithreading;

public class RunClass  extends Mythread    implements Runnable   {
	
	public void run() {
		int i =10;
		while(i-->0) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void team() {
		for(int i=0;i<6;i++) {
			System.out.println("hello"+i);
		}
	}
	
	
	public static void main(String[] args) {
		
		RunClass obj= new RunClass();
		obj.whiles(10);
	Thread objs= new Thread(obj);
	objs.start();
	obj.team();
	}
	
	

}
