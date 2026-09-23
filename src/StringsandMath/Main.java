package StringsandMath;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String
		
		String s1="learning String method";
		String s2="  hello word  ";
		System.out.println(s1.charAt(9));
		System.out.println(s1.concat("  "+s2));
		System.out.println(s1.length());
		
		System.out.println(s2.trim());
		System.out.println(s1.replace("n", "anand"));
		System.out.println(s1.repeat(10));
		System.out.println(s1.contains("string"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("d"));
		String h=" ";
		System.out.println(s1.endsWith("d"));
		
		System.out.println("empty"+h.isEmpty());
		
		System.out.println(s1.indent(5));// space will provide start
		
		System.out.println("blank"+h.isBlank());
		
		
		
		
		
		System.out.println(s1.indexOf("n"));
		System.out.println(s1.lastIndexOf("n"));
		System.out.println(s1.substring(0,5));
	String value[]	=s1.trim().split(" ");
	for(String values:value) {
		System.out.println(values+"***");
	}
	s1= new String("hello word");
String	s3=new String("hello word");
	System.out.println(s1.equals(s3));
	System.out.println(s1==s3);
	System.out.println(s1.matches(s3));
//	maths method
	
int num=(int)	Math.floor(45.89809);
	System.out.println(num);
	
	
	System.out.println(Math.floor(8.9999));
	
	System.out.println(Math.ceil(5.1));
	System.out.println(Math.round(5.6));
	float nums=(float) Math.PI;
	System.out.println(nums);
	
	System.out.println(Math.round(Math.random()*5));
	
	System.out.println(Math.max(56,78));
	System.out.println(Math.min(20,10));
	System.out.println(Math.abs(-9));
	System.out.println(Math.E);
	System.out.println(Math.powExact(5, 4));
	System.out.println(Math.pow(5.0, 10.0));
	
	
	
	
		
		
		

	}

}
