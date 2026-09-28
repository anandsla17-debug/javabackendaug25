package corejava;

public interface Interface {
	public String submethod(String name,String password);
 public static final String 	name="anad";
	public void a() ;
	public void collectbank(String bankname,String accno,String balance);
	public void displaybankdetials() ;
	private void g() {
		System.out.println("team");
	}
	default void u() {
		System.out.println("g"+name);
		g();
	}
	static void j() {
		System.out.println("n");
	}
	
//	public static void main(String [] args) {
//		Interface o= new Interface() {
//
//			@Override
//			public String submethod(String name, String password) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void a() {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void collectbank(String bankname, String accno, String balance) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void displaybankdetials() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//		
//		o.a();
//	}

}
