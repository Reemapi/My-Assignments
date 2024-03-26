package abstration;

public class Amazon {
	
	public void upiPayment() {
	System.out.println("upi payment from payment interface");	
	}
	public void internetBanking() {
		
	}
	public void recordpaymentDetails () {
	System.out.println("payment details from canara bank abstract class");	
	}
	
	public static void main(String[] args) {
		Amazon obj =new Amazon();
		obj.recordpaymentDetails();
		obj.upiPayment();
		obj.internetBanking();
	}
	
}

