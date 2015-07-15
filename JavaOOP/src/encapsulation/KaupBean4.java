package encapsulation;

import java.util.Scanner;
/*
 * @ Date : 2015. 07.14
 * @ Author : me
 * @ Story : 카우푸 지수 프로그램을 객체화 하는 예제
 * */
public class KaupBean4 {
	
	private String name,msg;
	private double height, weight;
	private int idx;
	
	/*
	 * 스캐너가 입력받은 값을 저장하는 메소드가 필요해 졌다.
	 * 이를 setter 메소드라고 한다.
	 * 이 setter 메소드는  set + 멤버필드() 로 이름이 자동 생성된다.
	 * setter 는 write 의미이다.
	 * */
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getIndex() { // 메소드(동사)
		
		idx = (int) ((weight / (height*height))*10000);
		
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
	}
	
	@Override
	public String toString() {
		
		// 선언부
		String str = ""; // 지역변수는 무조건 초기화
		// 연산부
		str = "["+name+"] 키 : "+height+"cm, 몸무게 : "+weight+"kg, 카우푸지수 : "+msg;
		// 출력부
		return str;
	}
}
