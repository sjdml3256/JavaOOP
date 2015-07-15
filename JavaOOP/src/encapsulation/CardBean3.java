package encapsulation;

public class CardBean3 {

	private String name,name2;
	private int num1,num2;
	
	public void setName(String name) {
		// () 안에 값을 파라미터라 하고 소속은 지변
		this.name = name;
		/*
		 * this.name 은 인스턴스 변수(멤변)이고
		 * = name 은 파라미터로 넘어온 지변(스캐너가 받은값)
		 * 스캐너가 받아 논 값을 가진 지변 값을
		 * 멤변(String name)에 name 대신 aaa 를 주고 =name 에 =aaa할당하면
		 * 에러가 없으므로 파라미터값과 멤변값의 이름은 상관없는것을 알수있다.
		 * 단, 데이터 타입(String,int...)은 반드시 일치해야한다.
		 * */
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getWinner() {
		// getter 에서 문제 해결 패턴
		// 초기화 후 private 의 해당 변수 삭제.
		String winner = "";
		if (this.num1 > this.num2) {
			winner = name+" 승리";
		} else if(this.num1 < this.num2) {
			winner = name2+" 승리";
		} else {
			winner = "비김";
		}
		return winner;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+" : "+num1+"] vs ["+name2+" : "+num2+"]\n"+this.getWinner();
	}
	
}
