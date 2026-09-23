package corejava;

import java.util.Scanner;

public class Subclass {
	
	public void datatype() {
		
		// primitive  datatype- int,char,btye,short,long,double,float,boolean
				// numberic type
				byte value=127;// -128 to 127
				System.out.println("byte"+value);
				short value1=32767;  //-32768 to 32767
				System.out.println("short"+value1);
				int value2= 1757656581; // 4 bytes /32bits; 2147483647
				System.out.println("int"+value2);
				long value3=4767856576547l;
				System.out.println("long"+value3);
		       	float value4=56.487587f;
		       	System.out.println(value4);
		       	double value5=78.87568759659843536487528754d;
		       	System.out.println(value5);
		       	// non-numberic type
		       	boolean result=true;
		       	System.out.println(result);
		       	char letter ='A';
		       	System.out.println(letter);
				
				
				
				//non primitive data-string,arrays,class,interfaces
		       	
		       	String  name="anand123$^";
		       	System.out.println(name);
		       	
		       	String arr[]={"hello","word"};
		       	System.out.println(arr[0]+" "+arr[1]);
		       	int num[]= {6,8,94,746};
		       	
		       	for(int team:num) {
		       		System.out.print(team+",");
		       	}
		
	}
	
	public void operators() {
// . Arithmetic Operators
    	
    	
    	int a=50,b=90;
    	System.out.println("\n"+(a+b));
    	System.out.println("add"+(a+b));
    	System.out.println("sub"+(a-b));
    	System.out.println("muti"+a*b);
    	int x=10,y=2;
    	System.out.println("div"+x/y);
    	int h=13,g=3;
    	System.out.println("modules"+h%g);
    	
    	int v1=90,v2=80;
    	int c=v1+v2;
    	System.out.println("add"+c);
    	
    	//assignment operator
    	
    	int team=20;
    	team=40;
    	System.out.println(team);
    	team+=90;
    	System.out.println("+="+team);
    	team*=2;
    	System.out.println("*="+team);
    	team-=6;
    	System.out.println("-="+team);
    	team/=2;
    	System.out.println("/="+team);
    	team%=7;
    	System.out.println("%="+team);
    	
    	
    	// Relational Operators ==
    	
    	String names="data";
    	System.out.println("=="+names=="data"); // memory address check
    	
    	String value55="7";
    	String value56="7";
    	System.out.println(".equals"+value56.equals(value55)); // content check
    	int n=10;
    	System.out.println(">="+(n>=8)); // same equal or greater then 8
    	 System.out.println("<="+(n<=10));
    	 System.out.println(">"+(n>8)); //  greater then 8
    	 System.out.println("<"+(n<10)); // laster then
    	 
    	 
    	 // task  100 step 10 +, step 50-,step*40,relationship check task ==90,display
    	 
    	 
    	 // logical operator  =>&& || !=
    	 
    	 // name ,password => true & true= true
    	 
    	 String sname="anand",password="123";
    	 System.out.println("and "+(sname=="anand" && password=="12")); // and
    	 
    	 System.out.println("or "+(sname=="anand" || password=="12")); // or
    	 
    	 
    	 System.out.println("not "+(sname!="anand1" && password=="123")); // not ,and
    	 System.out.println("xor "+(sname=="anand" ^ password=="123")); // xor
    	 
    	 // place,time, date => using (and gate)
    	 
    	 
    	 // preincrement and postincrement
    	 int increment=1;
    	 
    	 System.out.println(increment++); // post increment
    	 System.out.println(increment);  // 2
    	 
    	 System.out.println(++increment);// preincrement
    	  int decrement=5;
    	 System.out.println(decrement--);//postdecrement
    	 System.out.println(decrement);
    	 System.out.println(--decrement);
    	 
    	 //ternary operator
    	    Scanner  sc=new Scanner(System.in);
    	    System.out.println("Enter your age");
    	    
    	 int age=sc.nextInt();
    	 
    	 String results=(age>=18) ?" eligible to vote":"not eligible to vote";
    	 
    	 System.out.println(results);
    	 
    	 // even or odd num 
    	 
	}

	
	
	public void typecasting() {
		 // type casting
   	 
   	 // int to string convent
   	 
   	 
   	 int nums=10;// num
   
   	 String numsupdate= String.valueOf(nums); // int to string
   	 System.out.println( numsupdate+10);
   	 
   	 //  string to int
   	 String data="2500";
   	 int datas=1000+Integer.parseInt(data);//String to int
   	 System.out.println(datas+500);
   	 
   	 
   	 // int to float
   	 int  teams=78;
   	 float outfloat=teams;
   	 System.out.println(outfloat);
   	 // float to int 
   	 
   	  float salary=2500.00f;
int salaryint=(int)salary;
System.out.println(salaryint);


   	 // float to double
float amount=25.00f;
double doubleamount=amount;

System.out.println(doubleamount);
	}
}
