package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		//2015.07.14 카우프지수
		double height = 0.0d, weight = 0.0d;
		int idx = 0; // 카우푸 인덱스
		String name = "", msg = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("키와 몸무게를 차례대로 적으세요");
		height = scanner.nextDouble();
		weight = scanner.nextDouble();
		
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex();
		
		// 출력부
		System.out.println(kaupBean.toString());
	}
}
