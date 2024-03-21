package week3.day1;

public class LearnPolymorphism {
	
public void reportStep(String msg,String status) {
	System.out.println("Message:"+msg+ ",Status:"+ status);
	
	// TODO Auto-generated method stub

}
public void reportStep(String msg,String status,boolean snap) {
	System.out.println("Message:"+msg+",Status:"+status +",Snapshot:"+snap);
	// TODO Auto-generated method stub

}   

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnPolymorphism lp = new LearnPolymorphism();
		lp.reportStep("Step1","pass");
		lp.reportStep("step2","passed", true);	
	}

}
