package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;

import java.util.Vector;
public class Subcollection {

	public void Arraylist() {
		ArrayList<String>  adds= new ArrayList<String>();
		adds.add("anand");
		adds.add("arun");
		adds.add("kumar");
		adds.add("max");
		adds.remove(1);
		adds.set(1,"joe");
		
		
		System.out.println(adds);
		System.out.println(adds.size());
		System.out.println(adds.contains("joe"));
		System.out.println(adds.isEmpty());
		System.out.println(adds.get(2));
		ArrayList<String> team= new ArrayList<String>();
		team.add("anand");
		
		team.add("joe");
		team.add("max");
		System.out.println(adds.equals(team));// order,same data
		team.clear();
		adds.addFirst("team");
		adds.addLast("data");
		System.out.println(team);
		System.out.println(adds);
	
	}
	
	
	public void Set()  {
		HashSet<Integer>  data= new HashSet<Integer>();
		data.add(10);
		data.add(20);
		data.add(10);
//		data.remove(20); // data name used to remove
	System.out.println(	data.contains(10));
	HashSet<Integer> y= new HashSet<Integer>();
	y.add(10);
	y.add(20);
	System.out.println(data.equals(y));
	System.out.println(data.size());
	System.out.println(data.isEmpty() ==false);
//data.clear();
	
		System.out.println(data);
		
	}
	
	public void stack() {
		Stack<String> stack= new Stack<String>();
		stack.add("pencil");
		stack.push("pen");
		stack.push("scale");
		stack.pop();
		stack.addFirst("hello");
		stack.addLast("pencile");
		stack.set(1, "pen");
		stack.remove(1);
		System.out.println(stack.containsAll(stack));
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		stack.add("pencil");
		System.out.println(stack.capacity()); // 10 to 11 size  change in to 20
		System.out.println(stack.size());
	}
	
	// doubt
	public void Queue() {
	Queue<Integer> team= new LinkedList<Integer>();
	team.add(10);
	team.offer(10);
	team.offer(20);
	team.offer(99);
	team.poll();
	
	
	System.out.println(team);
	System.out.println(team.peek());
	}
	
	
	
	public void hashmap() {
		HashMap<String, Integer> hap = new HashMap<String, Integer>();
		hap.put("pen",10);
		hap.put("pencile", 20);
		hap.put("pen", 20);
		hap.put("scale", 100);
		System.out.println(hap);
		hap.remove("pencile");
	hap.put("len", 100);
System.out.println(hap.containsKey("scale"));
System.out.println(hap.containsValue(20));
		System.out.println(hap);
	}
	
	public void bank() {
		ArrayList<Bank> bank = new ArrayList<Bank>();
		bank.add(new Bank("indian", 1, "25000"));
		bank.add(new Bank("sbi", 2, "3000"));
//		bank.remove(1);
		bank.remove(0).getBankname();
	for(Bank team:bank) {
		
		if(team.getBankname()=="sbi") {
			
			team.setBankname("indian bank");
			
		}
		System.out.println(team.getBankname()+team.getNoofcustomer()+team.getTotalamount());
	}
	System.out.println(bank.get(0).getBankname()+bank.get(0).getNoofcustomer()+bank.get(0).getTotalamount());
	bank.set(0, new Bank("canara", 2,"10000"));
	System.out.println(bank.get(0).getBankname()+bank.get(0).getNoofcustomer()+bank.get(0).getTotalamount());
	bank.add(new Bank("t", 3, "1"));
	Bank banks= new Bank("t", 3,"1");
	System.out.println(bank.get(1));
	// equals,contains
	}
	
	public void Linkedlist() {
		List<Integer> team= new LinkedList<Integer>();
		team.add(10);
		team.add(20);
		team.add(30);
		team.set(2, 30);
		System.out.println(team);
	}
	public void prqueue() {
		PriorityQueue<Integer> team= new PriorityQueue<Integer>();
		
		team.add(25);
		
		team.add(2);
		team.add(8);
		team.add(5);
		team.add(11);
		team.add(1);
		
		System.out.println(team);
		
		}
	// dequeue
		public void dequeue() {
			Deque<Integer> team= new ArrayDeque<Integer>();
			team.add(10);
		team.addFirst(2);
		team.addLast(3);
		team.removeFirst();
		team.removeLast();
		team.poll();
		team.add(10);
		System.out.println(team.reversed());
		
			System.out.println(team);
			
		}
	
		public void tree() {
			TreeSet<Integer> team= new TreeSet<Integer>();
			team.add(7);
			team.add(4);
			team.add(2);
			team.add(10);
			team.add(1);
			System.out.println(team);
			TreeSet<String> s= new TreeSet<String>();
			s.add("b");
			s.add("d");
			s.add("a");
			s.add("a");
			String name="an";
			
			System.out.println(s);
		}
		
		public void treemap() {
			TreeMap<Integer, String> team= new TreeMap<Integer, String>();
			team.put(10, "pen");
			team.put(1, "pencile");
			team.put(0, "scale");
			team.put(0, "amount");
			System.out.println(team);
		}
		
		
		public void blockQueue() {
			try {
			Queue<String> team= new LinkedBlockingQueue<String>(3); // => blocking=> fixed =5
			team.add("a");
			team.add("b");
			team.add("c");
			team.add("a");
//			System.out.println("a"+team.offer("a"));
			System.out.println(team);
			System.out.println(team.size());
			}catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		
		public void Vector() {
		Vector<String> team = new Vector<String>();
		team.addFirst("hello");
		team.add("word");
		team.remove(0);
		ArrayList<String> data= new ArrayList<String>();
		data.add("pen");
		data.add("age");
		data.add("pencile");
		System.out.println("s"+data.clone());
		
		team.addAll(data);
		
		System.out.println(team);
		}
		
		public void hashtable() {
			Hashtable<Integer, String> team= new Hashtable<Integer, String>();
			team.put(1, "data1");
			team.put(2, "data2");
			team.put(0, "data3");
			System.out.println(team);
			
		}
}
