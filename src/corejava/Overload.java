package corejava;

public class Overload {
	
	void arithmeticoperation(int a,int b, int c) {
		
		System.out.println("add"+(a+b+c));
	}
	
	void arithmeticoperation() {
		System.out.println("unassigned assigned");
	}
	
	void arithmeticoperation(double a,double b) {
		System.out.println("sub"+(a-b));
	}
	void arithmeticoperation(int a,int b,double c) {
		System.out.println("mult"+(a*b*c));
	}

}
