package bank;

import java.util.Scanner;

public class KBbank {
	public static void main(String[] args) {
	
		BankRole bank = new Bank(100);
		// 인터페이스타입 인스턴스 = new 생성자();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("고객님 성함 : ");
		String name = scanner.next();
		System.out.println("비밀번호 4자리 입력 : ");
		int password = scanner.nextInt();
		System.out.println("얼마를 입금 하시겠습니까 : ");
		int money = scanner.nextInt();
		
		bank.openAccount(name, password, money);
		
		System.out.println("==== 계좌번호 조회(계좌번호) ====");
		System.out.println("검색하려는 고객 명");
		String searchName = scanner.next();
		
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByName(searchName);
		
		for(BankBook bankbook : searchArr){
			System.out.println(bankbook.showAccount());
		}
		
		System.out.println("검색 하려는 계좌번호");
		
		// 객체가 메소드를 호출 한후 연산을 통해 결과를 리턴 하였지만
		// 그 리턴 값을 받는 변수 처리는 개발자가 별도로 해줘야 한다.
		// 그 방법은 메소드가 리턴하는 리턴 타입을 알아내서
		// 그 타입으로 변수 하나를 만든다음 그 변수에
		// 리턴값을 할당 한다.
		BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
		System.out.println(bankBook.showAccount());
		
		System.out.println("삭제 하려는 계좌번호");
//		String delet = scanner.next(); // "12345" 와 12345 는 비교 불가
//		String deletAccount = String.valueOf(delet);
		// int 와 String 의 값을 서로 비교하려면
		// String 을 int 로 바꿔줘야 한다.
		// int one = String.valueOf(스트링타임); 의 결과값은 12345

		boolean closeOk = bank.closeAccount(scanner.next());
		if (closeOk == true) {
			System.out.println("삭제 되었습니다");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
	}
}
