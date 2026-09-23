package accessmodifieds;

 class Privateaccess {

	private String name="anand";
	public String Getname() {
		return name;
	}
	
	private void method() {
		System.out.println("private method");
	}
	
	public void submethod() {
		method();
	}
	
	private String studentdata() {
		return "name:anand,age:23,clg:abc clg";
	}
	
	public String substudentdata() {
		return studentdata();
	}
}
