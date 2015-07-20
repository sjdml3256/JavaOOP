package inhebitance;
/*
 * 객체 지향 프로그래밍 4대 특징 (2)상속
 * extends 라는 키워드로 부모(Phone) 역할을 하는 클래스를 선언하면
 * 자식클래스(CelPhone)는 부모 클래스의 자산(필드 + 메소드) 를 따로 선언하지 않아도
 * 사용하게 된다.
 * */
public class CelPhone extends Phone{
	/*생성자*/
	private boolean portable; // 이동이 가능한지 여부.
	private String move; // 가지고 다니는 상황을 표시.
	/*생성자*/
	
	/*멤버메소드*/
	public boolean isPortable() { 
		return portable;
	}
	// if-else 로 참 거짓을 판별하는 알고리즘을 구현하려면
	// 파라미터로 들어오는 값이 있어야 그 값에 대한 판별을 할 것이므로
	// 이상황에서는 set 에 구현한다.
	public void setPortable(boolean portable) {
	// boolean 타입의 getter 는 is*() 방식으로 자동 생성된다.
	// 이경우는 반드시 리턴타입의 지변을 선언하고, if-else 알고리즘을 구현해야한다.
		if (portable) { // portable 이 참이라면
			this.setMove("폰을 가지고 다닐수 있음");
		} else {
			this.setMove("폰을 가지고 다닐수 없음");
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
}
