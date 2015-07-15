package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015. 07.14
 * @ Author : me
 * @ Story : 카우푸 지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean2 {
	/*
	 * public 은 은닉화가 되어 있지 않은 상태이다.
	 * 은닉화를 하려면 private 을 넣어야 한다.
	 * 그런데 데이터 값은 private 을 넣어야(은닉화)하고
	 * 기능 - 메소드는 public 을 넣어야 한다.
	 * */
	/*
	 * 자바의 계층구조
	 * 프로젝트(어플리케이션) > 패키지 > 클래스 > 멤버
	 * 멤버는 두가지로 구성되어있다.
	 * -> private 으로 선언된(감춰진) 속성 : 멤버 필드
	 * -> public 으로 선언된(오픈된) 기능 : 멤버 메소드
	 * */
	private String name,msg;
	private double height, weight;
	private int idx;
	
	public void getIndex() { // 메소드(동사)
		/*
		 * 카우푸 지수는 키와 몸무게를 입력하면
		 * 저체중...정상...비만 이런식의 결과값을 알려주는 프로그램.
		 * 공식 : (몸무게 / 키*키)*10000 결과값이
		 * 30초과 : 비만, 24초과 : 과체중, 20초과 : 정상, 15초과 : 저체중, 13초과 : 마름, 10초과 : 영향실조
		 * 콘솔에 출력되는 문장
		 * "[홍길동] 키 180cm, 몸무게 : 70kg, 카우푸지수 : 정상" 
		 * */
		double hight = 0.0d, weight = 0.0d;
		int idx = 0; // 카우푸 인덱스
		String name = "", msg = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("키와 몸무게를 차례대로 적으세요");
		hight = scanner.nextDouble();
		weight = scanner.nextDouble();
		
		idx = (int) ((weight / (hight*hight))*10000);
		
		if (idx > 30) {
			msg = "비만";
		} else if(idx > 24) {
			msg = "과체중";
		} else if(idx > 20) {
			msg = "정상";
		} else if(idx > 15) {
			msg = "저체중";
		} else if(idx > 13) {
			msg = "마름";
		} else {
			msg = "영향실조";
		}
		System.out.println("["+name+"] 키 : "+hight+"cm, 몸무게 : "+weight+"kg, 카우푸지수 : "+msg);
	}
}
