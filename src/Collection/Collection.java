package Collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Collection {
public static void main(String[] args)  {
	
	Subcollection collection = new  Subcollection();
//	collection.Arraylist();
//	collection.Set();
	
//	collection.Queue();
//	collection.hashmap();
//	
//	HashSet<Staff>  staff= new HashSet<Staff>();
//	staff.add(new Staff(12, "maths"));
//	staff.add(new Staff(10,"maths"));
//	staff.add(new Staff(12,"maths"));
//	
//	for(Staff team: staff) {
//		System.out.println("staff id:"+team.getStaffid()+",subject:"+team.getStaffsubject());
//	}
collection.dequeue();
collection.prqueue();
collection.tree();
collection.treemap();
collection.blockQueue();
collection.Vector();
collection.hashtable();

	
}



}
