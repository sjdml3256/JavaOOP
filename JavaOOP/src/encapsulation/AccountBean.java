package encapsulation;

public class AccountBean {
	private int account;
	
	public AccountBean() {
		this.account = (int) ((Math.random()*99999)+1);
	}
	
	public int getaccount() {
		return account;
	}
}
