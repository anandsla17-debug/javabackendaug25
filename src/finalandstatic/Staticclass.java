package finalandstatic;

import java.util.Scanner;


public class Staticclass extends Partent {

	
	public static void studentform() {
		Partent.studentform();
		Partent.d();
		Scanner sc=new Scanner(System.in);
		System.out.println("----student form-----");
		System.out.println("enter your no");
		int no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your Date");
		String date =sc.nextLine();
		System.out.println("Enter your college name");
		String clg=sc.nextLine();
		System.out.println("Enter your Feedback");
		String Feedback=sc.nextLine();
		
		System.out.println("no:"+no+"name:"+name+"date:"+date+"clg:"+clg+"feedback:"+Feedback);
	}
	
	public static void studentform(int a) {
		System.out.println("a"+a);
	}
}
