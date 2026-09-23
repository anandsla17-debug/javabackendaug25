package conditionandloopstatement;

import java.util.Random;
import java.util.Scanner;

public class Condition {
// switch and if else
	
	//  employee 1000 salary => 8 hours
	//  1000/8
	
	// if else
	public void employeehoursalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("total day salary is 1000");
		System.out.println("Enter your hours");
		int hours= sc.nextInt();
		System.out.println(hours);
		int salary=1000;
		
		if(hours==1) {
			System.out.println("1 hour:"+salary/8+"rs");
		}else if(hours==2) {
			System.out.println("2 hours:"+salary/8*2+"rs");
		}else if(hours==3) {
			System.out.println("3 hours:"+salary/8*3+"rs");
		}
		else if(hours==4) {
			System.out.println("3 hours:"+salary/8*4+"rs");
		}
		else if(hours==5) {
			System.out.println("3 hours:"+salary/8*5+"rs");
		}
		else if(hours==6) {
			System.out.println("3 hours:"+salary/8*6+"rs");
		}
		else if(hours==7) {
			System.out.println("3 hours:"+salary/8*7+"rs");
		}
		else if(hours==8) {
			System.out.println("3 hours:"+salary+"rs");
		}
		else {
			System.out.println("total hours is 8 ,so you will 1 to 8 ");
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Enter your age");
	
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("egible to vote");
			
		}else {
			System.out.println("not egible to vote");
		
		}
		
	}
	
	
	//switch
	public void rate() {
		double ran= Math.random()*5+1;
		System.out.println(ran);
		int rates= (int)Math.floor(ran);
		System.out.println(rates);
		
		switch(rates) {
		case 1:
			System.out.println("low rating 1");
			break;
			
		case 2:
			System.out.println("little better ratting 2");
			break;
			
		case 3:
			System.out.println("average ratting 3");
			break;
		case 4:
			System.out.println("good ratting 4");
			break;
		case 5:
			System.out.println("super ratting 5");
			break;
			default:
				System.out.println("incorrect option");
		}
	
	
	}

//  poor 10 to 30  average31 to 50 good (51 to 80) exllent(90 to 100)
	
	// color 6 or 5 switch random
	
	
	
	
	
	
	
}
