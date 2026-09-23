package Recursition;



public class Recursion {

	// without loop to perform 0 to 99 print in console log
	int loop(int num) {
		if(num==0) {
			return 0;
		}
		System.out.println(num);
		return loop(num-1);
	}
	// 1 to 10 20 to 40
	// 6  and 30 to 45  stop => end 100;
	
	public int  loop1(int num) {
		if(num==6) {
			return loop1(num+10);
		}
		if(num==51) {
			return 0;
		}
		
		System.out.println(num);
		return loop1(num+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursion team= new Recursion();
//		team.loop(100);
		team.loop1(1);

	}

}
