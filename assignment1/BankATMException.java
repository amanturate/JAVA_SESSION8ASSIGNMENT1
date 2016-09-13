package assignment1;

public class BankATMException extends RuntimeException {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "You don't have sufficient funds in Account. Minimum Balance should be 10000.";
	}

}
