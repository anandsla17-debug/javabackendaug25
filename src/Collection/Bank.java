package Collection;

public class Bank {
private String bankname;
private int noofcustomer;
private String totalamount;
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public int getNoofcustomer() {
	return noofcustomer;
}
public void setNoofcustomer(int noofcustomer) {
	this.noofcustomer = noofcustomer;
}
public String getTotalamount() {
	return totalamount;
}
public void setTotalamount(String totalamount) {
	this.totalamount = totalamount;
}
public Bank(String bankname, int noofcustomer, String totalamount) {

	this.bankname = bankname;
	this.noofcustomer = noofcustomer;
	this.totalamount = totalamount;
}





}
