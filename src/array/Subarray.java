package array;

import java.util.Scanner;

public class Subarray {
public void Arr() {
	
	// static array
	int[] mark5=new int[5]; // 5 
	mark5[0]=60;
	mark5[1]=70;
	mark5[2]=80;
	mark5[3]=50;
	mark5[4]=75;
//	mark5[5]=90;
	
	System.out.println("Marks"+mark5[0]);
	
for(int i=0; i<mark5.length;i++) {
	System.out.print(mark5[i]+",");
}

System.out.println();
for(int mark:mark5) {
	System.out.println("mark"+mark);
	
}
	
	int[] data= {10,20,30};
	data= new int[10];
	
	System.out.println(data.length);
	
	
	System.out.println("All friuts size 5");
	String[] team=new String[5];
	System.out.println(team.length);
	Scanner sc= new Scanner(System.in);
	for (int i=0; i<team.length;i++) {
		System.out.println("fruit:"+(i+1));
		team[i]= sc.nextLine();
	}
	System.out.println("Display all fruits");
	for(String i:team ) {
		System.out.print(i+" ");
	}
	
	

}

public String[] data(String[] name) {
	
	return  name;
}
public void  twoarra() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your row size");
	int rowsize=sc.nextInt();
	System.out.println("Enter your col size");
	int colsize=sc.nextInt();
	String[][] student= new String[rowsize][colsize];
	sc.nextLine();
	for(int i=0;i<rowsize;i++) {
		for(int j=0;j<colsize;j++) {
			System.out.println("student data index="+i+j);
			
			student[i][j]=sc.nextLine(); 
		}
		
	}
	
	for(String team[]:student) {
		for(String output:team) {
			System.out.print(output+" ");
		}
		System.out.println();
	}
	
}

public void jaggedarray() {
	int [][] team= new int[3][]; // row => 3
	team[0]= new int[2];//  2col
	team[1]= new int[1];
	team[2]=new int[3];
	
	
	for( int teams[]:team) {
		for(int data:teams) {
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	int[][] value= {{10,30,30}
	,{20}
	};
	
}
}
