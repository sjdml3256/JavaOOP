package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 생성자 문법
 * 생성자는 setter 를 통해 값을 할당하는 기능을 보공하여
 * 객체가 만들어짐과 동시에 값을 할당하도록
 * 특수하게 만들어진 ★ ★ ★ 메소드 이다.
 * */
public class CardBean {
/*=====Field=====*/	
	private String name,name2;
	private int num1,num2;
	/*===== Constructor=====*/
	// 생성자 위치는 (멤버)필드 와 메소드 영역 사이에 위치
	// 생성자 모양
	// public 클래스이름(){}
	public CardBean(){/*this("",0(""와 0은 디폴트값)); 이라 치면 밑의 public 이 생겨나고 this문은 다시 지운다.*/} // 디폴트 생성자
		// 디폴트 생성자는 개발자가 직접 만들지 않아도
		// 프로그램 내부에서는 생성되 있는 것 으로 인식한다.
		// 그런데 이것을 꺼내든 이유는 
		// new 키워드를 통한 객체생성 역할 뿐 아니라
		// 생성과 동시에 값을 할당하는 기능을 추가시키기 위해서이다.
	public CardBean(String name) {
		// setter 역할을 겸용 하는 생성자.
		this.name = name;
		this.num1 = (int) ((Math.random()*13)+1);
	} // 이것으로 양식을 하나 만들어놓고 CardMain의
		// CardBean hong = new CardBean(name); 
		// CardBean kim = new CardBean(name2); 으로 불러 내는것

	/*=====Method=====*/
	public String getName() {
		return name;
	}
	public int getNum1() {
		return num1;
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
