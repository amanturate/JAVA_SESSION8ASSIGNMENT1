package assignment1;

public class BankAtm {

	static int atmId;
	static String bankName;
	static String location;
	double balance;

	public BankAtm(int atmId, String bankName, String location, double balance) {
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}

	public void withdraw(double amt) {
		if (amt > balance || balance < 10000) {
			throw new BankATMException();
		}

		else {
			balance = balance - amt;
			System.out.println("Transaction Completed. Your New Balance is "
					+ balance);
		}
	}

	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("Transaction Completed. Your New Balance is "
				+ balance);

	}

}
