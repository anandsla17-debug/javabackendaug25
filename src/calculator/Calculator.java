package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice=0;
		
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("-----calucator console app-------------");
		
		
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.division");
			System.out.println("0.Exit");
			System.out.print("Enter your option:");
			choice=sc.nextInt(); // user input
			int value1=0;
			int value2=0;
			switch(choice) {
			case 1:
				System.out.println("Enter your first value");
				 value1=sc.nextInt();
				System.out.println("Enter your Second value");
				 value2=sc.nextInt();
				System.out.println("add:"+(value1+value2));
				break;
				
			case 2:
				System.out.println("Enter your first value");
				 value1=sc.nextInt();
				System.out.println("Enter your Second value");
				 value2=sc.nextInt();
				System.out.println("sub:"+(value1-value2));
				break;
			case 3:
				System.out.println("Enter your first value");
				 value1=sc.nextInt();
				System.out.println("Enter your Second value");
				 value2=sc.nextInt();
				System.out.println("multi:"+value1*value2);
				break;
			case 4:
				System.out.println("Enter your first value");
				 value1=sc.nextInt();
				System.out.println("Enter your Second value");
				 value2=sc.nextInt();
				System.out.println("div:"+value1/value2);
				break;
				
			case 0:
				System.out.println("thank you for your time");
				break;
				default:
					System.out.println("incorrect option");
					break;
			}
			
			
			
		}while(choice!=0);
		
		
		
	}

}
