package corejava;


public  class Corejava {

	public  static void main(String[] args) {
		

//		Subclass obj=new Subclass();
//		obj.operators();
//       
//		
//     // place class => state =>3  tamil nadu=>(3 d)
//    	 
//    	 
//    Childclass child= new Childclass();
//    child.add();
//    child.datatype();
//    child.typecasting();

    
    //   3 class a add ,b sub,c div => obj 
    	
    	
   
    // polymorphism =>runtime(method override),complied time (method overloading)
    	 
    	 
    	 // override
    	 Child override = new Child();
    	 override.animal();
    	
       
    	// two class => parent two method  child one method => main 
    	
    	 
    	 Overload overload= new Overload();
    	 overload.arithmeticoperation();
    	
    	 overload.arithmeticoperation(60.90, 70.90);
    	 overload.arithmeticoperation(40, 80, 10.9089);
    	 overload.arithmeticoperation(5, 40, 0);
    	 
    	 
    	 Encapsulation ex= new Encapsulation("arun");
   ex.setName("max");
  System.out.println(ex.getName());
    	 ex.SetAge(21);
System.out.println(ex.getAge());
//(String)place,(float)age,(double)salary =>get and set


	
Abstracts abbstract= new Abstractimplement("max","math","5");
abbstract.subject();
abbstract.team();
abbstract.displaystaff();


Interface in= new Interfaceimplement();
in.a();
System.out.println(in.submethod("arun","1233876"));
		in.collectbank("abc bank", "1256", "20000");
		in.displaybankdetials();
		
		
		Constructorarry input[] = new Constructorarry[5];
		 String data[]= {"pen","scale","pencile"} ;
		input[0] = new Constructorarry(data,"10","1");
		input [1]= new Constructorarry(data, "20", "2");
		input[2]= new Constructorarry(data, "5", "3");
		input [3]= new Constructorarry(data, "20", "2");
		input[4]= new Constructorarry(data, "5", "3");
		for(Constructorarry inputs:input) {
			for(String n:inputs.productname)
		        System.out.println(n);
		}
	   
		
	}
	
	
	
	

}
