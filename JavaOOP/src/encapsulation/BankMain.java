package encapsulation;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* BankBook bankBook = new BankBook(); // Bankbook 클래스에 디폴트 생성자가 없으면 에러.
		 * 또는 밑 처럼 만들어야함.
		 * 
		 * 생성자가 가지는 기능
		 * 1. 객체를 만드는 기능
		 * 2. setter 기능
		 * 3. 객체가 만들어지는데 필수적인 요소가 주어지지 않으면 아예 생성을 막는 기능.
		 * 	  ==> 제약, 방어 코딩
		 * */
		System.out.println("통장주 이름 : ");
		
		/*String name = scanner.next();
		BankBook bankBook = new BankBook(name);*/ // 아래의 것과 같은 코딩.
		BankBook bankBook = new BankBook(scanner.next());
		
		System.out.println("입금 : ");
		bankBook.deposit(scanner.nextInt());
		
		System.out.println("출금 : ");
		bankBook.withDraw(scanner.nextInt());
		
		System.out.println("입금 : ");
		bankBook.deposit(scanner.nextInt());
		
		System.out.println(bankBook.toString());
	}
}
