package accessmodifieds;

public class Access {
// class,method,value
	
	public int rs=1000;
	
	public void method() {
		System.out.println("public method");
	}
	
	public void   submethod() {
		method();
	}
}
