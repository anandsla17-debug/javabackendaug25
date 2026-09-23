package Functioninterface;

public class FunctionalMain {
	
	public static void main(String[] args) {
		
	Functiontopic fun=new Functiontopic() {
		@Override
		public void display() {
			System.out.println("display data");
		}
		@Override
		public void run() {
			System.out.println("check 2");
		}
		
		@Override
		public int sum(int a,int b) {
			
			return a+b;
		}
	};
	fun.display();
	fun.run();
	System.out.println("sum"+fun.sum(20, 20));
	
	//lambda in not mutliple method use
	Singleteam single= ()->{
	System.out.println("check team");
	System.out.println("");
	};
	single.team();
	
	
	// lambda return
	
	Lambdareturn total = (int s,int m)->{
		return s+m;
	};
	Lambdareturn totals = (int s,int m)->{
		return s-m;
	};
	System.out.println("total:"+total.total(10, 10));
	System.out.println("total sub:"+totals.total(10, 20));
	}
	
	
	
	// method method => bank  , user=> 
	// method  double sum => double a,double b => +,-.*
	
	

}
