package accessmodifieds;

public class Subaccess extends Access {
	public void method() {
		System.out.println("sub rs:"+rs);
	}
	public void rs() {
		rs=4000;
		System.out.println("rs update"+rs);
	}

}
