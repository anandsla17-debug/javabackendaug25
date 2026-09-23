package corejava;

public class Interfaceimplement implements Interface {
public String submethod(String name,String password) {
	
	return "name:"+name+" "+"password:"+password;
}
  public void a() {
	System.out.println("123456+7486");
}

public String bankname;
public String accno;
public String balance;
public void collectbank(String bankname,String accno,String balance) {
	this.bankname=bankname;
	this.accno=accno;
	this.balance=balance;
}

public void displaybankdetials() {
	System.out.println("name:"+bankname+"accno"+accno+"balance:"+balance);
}
}
