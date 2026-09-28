package corejava;

public class Constructorarry {
	
	public String productname[];

	public String[] getProductname() {
		return productname;
	}

	public void setProductname(String[] productname) {
		this.productname = productname;
	}

	public Constructorarry(String productname[],String productprice,String productid) {

		this.productname=productname;
		System.out.println("product name:"+productname[1]+"product price:"+productprice
				+"product id"+productid);
		
	}
	
	

}
