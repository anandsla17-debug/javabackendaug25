package corejava;

import java.util.Scanner;

public class Childclass extends Subclass {
	
	public void add() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your first value");
		int value1=sc.nextInt();
		System.out.println("Enter your second value");
		int value2=sc.nextInt();
		System.out.println("add output:"+(value1+value2));
		
	}

}
