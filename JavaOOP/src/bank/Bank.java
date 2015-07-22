package bank;

public class Bank implements BankRole{
	
	// 계좌 계설
	@Override
	public void openAccount(String accountNo, String ownerName,
			String password, int money) {
		
	}

	// 계좌 검색 (계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}
	
	// 계좌 검색(이름) -> 리턴결과 : 계좌 1개 이상
	@Override
	public Account[] searchAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}

	// 계좌 검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		int count = 0;
		return count;
	}

	// 계좌 폐지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String AccountNo) {
		boolean flag = false;
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
