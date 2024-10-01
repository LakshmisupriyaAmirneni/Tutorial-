package abstraction;

public class HelperATR {

	public static ATR1 output() {
		ATR1 atr=new ATR2();
		return atr;
	}
	
	public static void main(String[] args) {
		ATR1 atr = output();
		atr.getAdminDetails();
		atr.getCustomerDetails();
	}
}
