package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 * Pay 프로그램은 월급을 입력받아 세금을 떼고
		 * 실 급여를 고객에게 알려주는 프로그램 이다.
		 * 세율 10%
		 * 결과 출력문
		 * [홍길동 실급여]
		 * 월급 : 100 만원
		 * 세금 : 10 만원
		 * 실급여 : 90 만원
		 * */
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int salary = 0,tax = 0, money = 0;
		
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("월급 : ");
		salary = scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setSalary(salary);
		
		
		System.out.println(payBean.toString());
	}
}
