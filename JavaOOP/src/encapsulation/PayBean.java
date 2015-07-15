package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부로 나누고
	//Bean 클래스라면 멤버필드 + 멤버메소드
	private String name;
	private int salary,tax,money; // 멤버 필드 변수는 초기화 하지 않는다.
	
	// 멤버메소드 영역
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getTax() {
		int tax=0; //지변은 초기화 필수
		tax = (int) (salary *  0.1);
		return tax;
	}
	/*
	 * this 는 이 클래스 내부에 있는 ~~~ 의미.
	 * */
	public int getMoney() {
		int money = 0; //지변 초기화
		money = salary - getTax(); // tax 로 가져오면 계산안된 tax 가 오고, gettax 로 가져오면 계산된 tax가 온다.
		return money;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+" 실급여]\n"
				+ "월급 : "+salary +"\n"
				+ "만원 세금 : "+this.getTax()+"\n"
				+ "만원 실급여 : "+this.getMoney()+" 만원";
	}
}
