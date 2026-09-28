package exeception;

public class Balanace {

	public void Bankbalance(int amount)  {
	try {
			if(amount==0) {
				throw new RuntimeException("min maintaince amount");
			}
		if(amount<500) {
			throw new Min500balance("min maintain rs 500");
		}
		
		System.out.println("amount:"+amount);
		}catch (Min500balance e) {
			// TODO: handle exception
			System.out.println("error"+e.getMessage());
		}catch (Exception e) {
			System.out.println("error"+e.getMessage());
			
		}
	}
	
	
	
	public void max(int balance) throws Max10000limit {
		if(balance>10000) {
			throw new  Max10000limit("max limit is 10000");
		}
	}
}
