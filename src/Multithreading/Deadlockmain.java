package Multithreading;

public class Deadlockmain {
public static void main(String[] args) {
	
	Aclass a= new Aclass();
	BClass b= new BClass();
	
	Thread t1= new Thread(()->{
		a.a(b);
	});
	
	Thread t2=new Thread(()->{
		b.b(a);
	});
	t1.start();
	t2.start();
}
}
