package finalandstatic;

  public class Finalclass {
 	static  int accountno=908376387;// declared
	 // static method not static value assign
final	void Bankdetials() {
		
		accountno=90; //reassigned
		System.out.println("accountno:"+accountno);
	}
	

final  void Bankdetials(int a) {
		System.out.println("a:"+a);
	}

Finalclass(){
	
}

void user() {
	System.out.println("new user");
}
}
