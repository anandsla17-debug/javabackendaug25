package conditionandloopstatement;

public class Loop {
// for while dowhile
	public void loopmethod() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println("i:"+i);
			if(i==7) {
				break;
			}
			
		}
		int team=0;
		while(team<=10) {
			if(team==7) {
				team++;
				continue;
			}
			System.out.println("teams:"+team);
			team++;
			
			
		}
		
		int value =1;
		do {
			System.out.println("value:"+value);
			System.out.println("thank you");
		}while(value!=1);
		
		
		// do while switch value1 and value 2  option (=,-,*,/)
	}
	
}
