package exeception;

import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a=10,b=0;
		
		System.out.println(a/b);
 
		}catch(ArithmeticException e) {
			System.out.println("error:"+e.getMessage());
		}

		try {
		String name=null;
		System.out.println(name.length());
		}catch(Exception e) {
			System.out.println("null"+e.getMessage());
			
		}
		
		try {
		String thing="pen";
		System.out.println(thing.charAt(3));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		List<Integer> team= new LinkedList<Integer>();
		team.add(10);
		team.add(20);
		team.add(30);
		team.set(2, 30);
		System.out.println(team.get(4));
		System.out.println("check");
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		String word="abc";
		int num= Integer.valueOf(word);
		
		System.out.println(num);
		
		
		
			
		}catch(NumberFormatException e) {
			System.out.println("error:"+e.getMessage());
		}
		Balanace b= new Balanace();
		b.Bankbalance(0);
		try {
		b.max(120000);
		}catch(Max10000limit e) {
			System.out.println(e.getMessage());
		}
//		try {
//		b.Bankbalance(100);
//		}
//		catch (Min500balance e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		
		System.out.println("team...");
		
	}
	

}
