package Multithreading;

public class BClass {
synchronized void b(Aclass a) {
	System.out.println("thread 2=>b....");
	a.teama();
}
synchronized void teamb() {
	System.out.println("team b......");
}
}
