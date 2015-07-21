package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		/*
		 * [출력문]
		 * 아이폰을 사용해서
		 * 폰을 가지고 다닐수 있음
		 * 홍길동에게 데이터를 전달
		 * */
		// 아이폰이 출력되게 하려면 
		// 클래스 변수(=스태틱 변수)는
		// 클래스이름.BRAND 로 가져오면 된다.
		iphone.setCompany(Iphone.BRAND);
		iphone.setPortable(Iphone.TRUE);
		// 클래스명.필드명 ... get/set없이 사용하는 이유는
		// 은닉화가 필요 없는 고정된 값이기 때문에
		// Iphone.BRAND 식으로 사용해야한다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("통화 상대 입력 : ");
		String name = scanner.next();
		iphone.setCall(name);
		System.out.println("보내는 메세지 입력");
//		iphone.setData(iphone.getCall(), scanner.next()); // 밑의 줄과 의미는 같다.
		iphone.setData(name, scanner.next());
		
		System.out.println(iphone.getCompany()+"을 이용해서");
		System.out.println(iphone.getMove());
		System.out.println(iphone.getData());
	}
}
