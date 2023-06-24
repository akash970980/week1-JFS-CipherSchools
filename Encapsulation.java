package Week1;

public class Encapsulation {
	public static void main(String[] args) {
		Amazon customer= new Amazon();
		float payableAmount=customer.transaction(1000);
		System.out.println("Total Payable "+payableAmount);
	}
}

class Amazon{
	float transaction(float amt) {
		GPay gPayObj= new GPay();
		gPayObj.setTxnCharge(0.07f);
		float totalAmount =amt+(amt*gPayObj.getTxnCharge());
		return totalAmount;
	}
}
class GPay{
	private float txnCharge=0.05f;
	
	public void setTxnCharge(float newCharge) {
		txnCharge=newCharge;
	}
	
	public float getTxnCharge() {
		return txnCharge;
	}
}