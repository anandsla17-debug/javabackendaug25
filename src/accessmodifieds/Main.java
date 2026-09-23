package accessmodifieds;

 public  class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("public");
Access access= new Access();
access.rs+=2000;
System.out.println("rs:"+access.rs);

access.method();

Subaccess sub= new Subaccess();
sub.rs();
sub.method();

System.out.println("private");
Privateaccess pri= new Privateaccess();


System.out.println("get name:"+pri.Getname());
pri.submethod();
System.out.println(pri.substudentdata());
System.out.println("defualt");
Defualtaccess de= new Defualtaccess();
de.method();
System.out.println("place:"+de.place);

Subdefualt subs= new Subdefualt();
subs.submethod();
subs.method();

System.out.println("protected");
Protectedaccess protect = new Protectedaccess();
protect.method();

System.out.println("protect:"+protect.salary);


// different => protected,defualt
	}

}
