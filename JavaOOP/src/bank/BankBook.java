package bank;

public class BankBook implements Account{
	
	public static String BANK;	// 은행명은 바뀌면 안됨.
	private int bankbookNo;		// 통장번호는 바뀌면 안됨.
	private String name;		// 외부에서 입력받고 바뀌면 안됨.
	private int money;			// 상황에 따라 바뀜.
	private int pass;
	private String msg; // 유효성 체크 결과를 알려줘서 고객이 만약
						// 실수로 그렇게 입력했다면 공지해주는 기능
	
	public BankBook(String name) {
		this.BANK = "아이티뱅크";
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}

	/*===== Member Method =====*/
	@Override
	public String toString() {
		
		return "==============\n"
				+ " ["+BANK+"]\n"
				+ " 계좌번호 : "+bankbookNo+"\n"
				+ " 이름 : "+name+"\n"
				+ " 잔액 : "+money+"\n"
				+ " ==============";
	}

	public int getBankbookNo() {
		return bankbookNo;
	}
	
	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public int getPass() {
		return pass;
	}

	@Override
	public void withDraw(int money) {
		// TODO Auto-generated method stub
		// 파라미터 값이 정상값이 아닌 상태를 추적해서
		// 필터링하는 로직이 필요해짐(예. 마이너스 입력방지)
		// ==> 유효성 체크
		if (money<=0) {
			msg = "출금액은 0보다 커야합니다";
		} else if (this.money < money){
			msg = "출금액이 잔액보다 큽니다.";
		} else {
			this.money -= money; // 누적된 값에서 마이너스
		}
	}
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		if (money<=0) {
			msg = "입금액은 0보다 커야합니다";
		} else {
			this.money += money; // 누적된 값에서 마이너스
		}
	}

	

	
}
