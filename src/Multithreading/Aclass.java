package Multithreading;

public class Aclass {

	synchronized void a(BClass b) {
		System.out.println("thread 1=>a");
		b.teamb();
	}
	
	synchronized void teama() {
		System.out.println("team a.....");
	}
	
}
