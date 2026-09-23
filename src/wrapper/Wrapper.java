package wrapper;

import java.util.ArrayList;


public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer value=56;
		
		// unboxing
		int value1= value;

		
		int a=90;
		//autoboxing
		Integer a1= a;
		
		// array
		ArrayList<Integer> adds= new ArrayList<>();
		adds.add(21);
		adds.add(23);
		System.out.println(adds.get(0));
		
		
		String team="90";
		
		int mark= Integer.parseInt(team);
		System.out.println(mark);
		
		Character tam='t';
		
		
	}

}
