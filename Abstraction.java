package Week1;


	interface olaCustomer{
		void bookCab();
		void findARide();
		void rentCab();
		void rateDriver();
		void scheduleCab();
		void cancelCab();
		void addMoneyToWallet();
		void raiseTicket();
		void signUp();
		void signIn();
	}
	interface olaDriver{
		void acceptBooking();
		void getCustomerLocation();
		void getAvailableStatus();
		void getMyCommission();
		void raiseMoneyTransferRequest();
		void callCustomer();
		void setUpYourVechile();
		void customerFeedBack();
	}
	
	interface olaOwner{
		void getDriveRecords();
		void getReportNtDriverID();
		void getReportByRegion();
		void getTotalrevenue();
		void getCustomnerFeedback();
		void addDriver();
		void removeDriver();
		void changeDriverStatus();
		
	}
	
public class Abstraction implements olaOwner, olaDriver, olaCustomer{	
	public static void main(String[] args) {
		Abstraction obj= new Abstraction();
		olaCustomer cust= new Abstraction();
		olaDriver manoj = new Abstraction();
		
		
	}

	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findARide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rentCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scheduleCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoneyToWallet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAvailableStatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMyCommission() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseMoneyTransferRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUpYourVechile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerFeedBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDriveRecords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportNtDriverID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReportByRegion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalrevenue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomnerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
		
	}
}
