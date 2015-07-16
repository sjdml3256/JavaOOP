package encapsulation;

import java.util.Scanner;

public class CardMain {
	public static void main(String[] args) {
		/*
		 * 카드 두장을 비교해서 카드 번호가
		 * 더 큰수가 이기는 게임 프로그램을 작성하시오.
		 * 일단, 프로토타입(시제품) 프로그램으로
		 * 개발자가 임의의 숫자를 입력하면 출력은
		 * [홍길동 : 7] vs [김유신 : 3]
		 * 홍길동 승
		 * */
		
		// 집에 있는 유저가 자기 모니터에 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("플레이어 이름");
		CardBean hong = new CardBean(scanner.next());
		System.out.println("플레이어 이름");
		CardBean kim = new CardBean(scanner.next());
		
		// 인터넷 망을 타고 데이터 값이 게임회사로 들어옴
		
		
		
		CardGame game = new CardGame(hong,kim);
		
		// 사용자가 결과 화면을 보는중
		System.out.println(game.toString());
	} 
}
