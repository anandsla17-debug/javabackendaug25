package OptionalClass;

import java.util.ArrayList;
import java.util.Optional;
public class OptionalClass {

	
	
	public static void main(String[] args) {
		String name=null;
		Optional<String> result =  Optional.ofNullable(name);
		System.out.println(result.isPresent());
		System.out.println(result.isEmpty());
		System.out.println("l"+result.equals(result));
		String name1="anand";
		Optional<String> r= Optional.ofNullable(name1);
		System.out.println(r.isEmpty());
		System.out.println(r.isPresent());
		System.out.println(r.equals(result));
		ArrayList<String>  adds= new ArrayList<String>();
		adds.add("anand");
		adds.add("arun");
		adds.add("kumar");
		adds.add("max");
		adds.remove(1);
		adds.set(1,"joe");
		Optional<ArrayList<String>> date= Optional.of(adds);
		System.out.println(date.isPresent());
		System.out.println(date.isEmpty());
		
		
	
	}
}
