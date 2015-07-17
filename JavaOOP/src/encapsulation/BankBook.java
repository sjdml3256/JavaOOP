package encapsulation;

import abstraction.Account;

/*
 * 객체지향 프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
 * 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야한다.
 * 통장을 이루는 요소를 생각해보자.
 * 그 요소가 결국 인스턴스 변수를 구성하게 된다.
 * 1. 은행이름 => 아이티 뱅크 bank
 * 2. 통장번호 => 5자리의 랜덤숫자 bankbookNo
 * 3. 소유자 이름 => 생성자의 스캐너로 입력받는값 name
 * 4. 날짜 / 예금액 / 출금액 / 잔액 => 돈 => 스캐너로 입력받는 값 (int) money
 * 5. 비밀번호 => 스캐너로 입력받는값 (int) pass
 * 
 인터페이스
 1. withDraw(int money):void
 2. deposit(int money):void
  [출력]
 ==============
 [아이티뱅크]
 계좌번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
 ==============
 BankBook 이라는 클래스 라이브러리를
 NDrive 에서 다운받아서 사용하세요.
 비번은 돈 먼저 입금하세요.
 * */
public class BankBook implements Account{
	
	// 상수 : final 을 붙여서 절대 불변의 값을 만든다.
	// 스태틱 : final 을 빼면 절대 불변의 값이 아니라 바꿀수는 있지만 고정된 값 스태틱 값이 된다.
	//				   빼고 bank를 대문자로 적어주면 이것도 상수이다.(단 상수를 사용한 곳에도 대문자 사용)
	// 스태틱 = 클래스 변수
	// 클래스 호출 => BankBook b = new BankBook();
	//			  b.bank --> 인변이 값을 호출한 것
	//			  BankBook.bank --> 클래스 변수 호출하는 모양
	// 위치 : 필드 --> {인변, 상수, 클래스변수} < 멤변
	
	/*===== Member Field =====*/
	//private static final String bank = "아이티뱅크";
	private static String BANK;	// 은행명은 바뀌면 안됨.
	private int bankbookNo;		// 통장번호는 바뀌면 안됨.
	private String name;		// 외부에서 입력받고 바뀌면 안됨.
	private int money;			// 상황에 따라 바뀜.
	private int pass;
	private String msg; // 유효성 체크 결과를 알려줘서 고객이 만약
						// 실수로 그렇게 입력했다면 공지해주는 기능
	
/*public BankBook() {
	// TODO Auto-generated constructor stub
}*/ //디폴트 생성자
	
	
	public BankBook(String name) {
		this.BANK = "아이티뱅크";
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name;
	}
	// 개발자는 setter 를 쓸지, 생성자로 끝낼지 고민해본다.
	// getter setter 단축키 ALT + SHIFT + S -> Generate getter setter
	

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
	/*
	public void withDraw(int money){
		// 파라미터 값이 정상값이 아닌 상태를 추적해서
				// 필터링하는 로직이 필요해짐(예. 마이너스 입력방지)
				// ==> 유효성 체크
	}
	
	public void deposit(int money){
		
	}*/
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
