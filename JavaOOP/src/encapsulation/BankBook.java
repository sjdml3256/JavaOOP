package encapsulation;
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
  [출력]
 ==============
 [아이티뱅크]
 계좌번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
 ==============
 * */
public class BankBook {
	private String bank, name;
	private int bankbookNo, money, pass;
	
	public BankBook(BankBook date,BankBook in, BankBook out,BankBook save) {
		
	}

}
