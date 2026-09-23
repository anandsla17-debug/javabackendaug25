package string;

import java.util.*;

public class Stringclass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//string pool
		String place ="pondy";
//		place="chennai";
		String address="pondy";
		
		System.out.println(place==address);
		
		System.out.println("place:"+place);
		place.concat("villipuram");
		System.out.println("place:"+place);
		
		String thing=new String("pen");
String thing1=new String("pen");
System.out.println(thing==thing1);
System.out.println(thing.equals(thing1));


StringBuilder data= new StringBuilder("java");
data.append(" programming");
data.delete(0, 4);
data.insert(0, "python");
data.deleteCharAt(0);

System.out.println(data.indexOf("a"));
data.replace(0, 1, "jy");
data.repeat(data, 2);
//data.reverse();
data.setCharAt(0, 'L');
System.out.println(data);
System.out.println(data.length());
data.ensureCapacity(10);
System.out.println(data.capacity());

StringBuilder teams= new StringBuilder();
System.out.println(teams.capacity());

StringBuffer buffer1= new StringBuffer("student odmorning");

StringBuffer buffer= new StringBuffer("good");
buffer.append("morning");
buffer.delete(0, 2);
buffer.insert(0, "student ");
buffer.insert(0, "t");
System.out.println(buffer.compareTo(buffer1));
System.out.println(buffer);
String things= "pen ,pencil, scale";
String[] arr=things.split("");
for(String t:arr) {
	System.out.println(t+",");
}
System.out.println();
StringTokenizer team =new StringTokenizer(things,",");
System.out.println("count"+team.countTokens());
while (team.hasMoreTokens()) {
//	System.out.println(team.hasMoreTokens());
System.out.println(team.nextToken());
}



	}

}
