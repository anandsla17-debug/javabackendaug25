package conditionandloopstatement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 condition or 2 loop");
		int value=sc.nextInt();
		if(value==1) {
Condition hours=new Condition();


hours.rate();
hours.employeehoursalary();
		}else if(value==2 ) {
Loop l=new Loop();
l.loopmethod();
		}

	}

}
