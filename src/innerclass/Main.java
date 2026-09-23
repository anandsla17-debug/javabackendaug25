package innerclass;

public class Main {
 protected class Sub{
	 void details() {
		System.out.println("inner class");
	}
	 
	 static void nums() {
		 System.out.println("collect of nums");
	 }
}
 
 static class Sub1{
	Sub1(){
		 System.out.println("inner constructor");
	 }
	static void inner() {
		System.out.println("sub method");
	}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main team= new Main();
		Main.Sub team1= team.new Sub();
		team1.details();
		Sub.nums();
		

	
	Main.Sub1 i=  new Sub1();
	Sub1.inner();

	}
	

}
