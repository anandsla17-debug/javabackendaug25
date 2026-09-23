package corejava;

public class Abstractimplement extends Abstracts {
	private String staffname,staffsubject,staffexperience;
	public Abstractimplement(String staffname,String staffsubject ,String staffexperience) {
		this.staffname=staffname;
		this.staffsubject=staffsubject;
		this.staffexperience=staffexperience;
		
	}
	void displaystaff() {
		System.out.println("staffname:"+staffname+"staffsubject:"+staffsubject+"staffexperience:"+staffexperience);
	}
	void subject() {
		System.out.println("maths"+" "+"tamil"+" "+"english");
	}

}
