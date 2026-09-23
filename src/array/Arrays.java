package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [][] nums= {
				{20,2,5},
				{40,70,60},
				{50,80,60}
				};
//		System.out.println(nums[2][2]);
		
		
		
		
		for(int i=0; i<nums.length;i++) {
		
		for(int num:nums[i]) {
			System.out.print(num+" ");
		}
		System.out.println();
		}
		
		
		for( int num[]:nums) {
			for(int team:num) {
				System.out.print(team+" ");
			}
			System.out.println();
		}
		
		String[][] name=new String[4][4];
		name[0][0]= "arun";
		System.out.println(name[0][0]);
		
		Subarray team= new Subarray();
		
		String[] input= {"arun","joe","max"};
	String [] output	=team.data(input);
	for(String outputs:output) {
		System.out.println(outputs);
	}
	
//	team.twoarra();
//	team.jaggedarray();
	
	HashSet<Integer> t= new HashSet<Integer>();
	t.add(10);
	t.add(20);
//	t.set(1, 50);
	t.add(10);
	t.remove(10);
	System.out.println(t);
	}
	
	
	
	
	
	

}
