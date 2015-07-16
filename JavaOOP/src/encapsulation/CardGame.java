package encapsulation;
/*
 * 버전업
 * 현재는 홍길동 승 로만 나오는데
 * 개선을한다.
 * ========
 * 홍길동 : 6
 * 김유신 : 4
 * 홍길동 승리
 * ========
 * */
public class CardGame {
/*===== Field =====*/
	
	private String winner, looser;// 멤변 선언.
	private int winScore, LooseScore;
	
/*===== Constructor =====*/
	// 생성자 단축키
	// CTRL + SPACE
	public CardGame() {} // 디폴트 생성자
	
	public CardGame(CardBean bean1, CardBean bean2) {
				
				String winner = "",looser = "";
				int winScore = 0, looseScore = 0;
				// 지역변수(로컬변수) 는 메모리 영역 중에서 (콜)스택 저장
				// 인스턴스변수는 메모리 영역 중에서 힙에 저장
				
				if (bean1.getNum1() > bean2.getNum1()) {
					winner = bean1.getName();
					looser = bean2.getName();
					winScore = bean1.getNum1();
					looseScore = bean2.getNum1();
				} else if(bean2.getNum1() < bean2.getNum1()) {
					winner = bean2.getName();
					looser = bean1.getName();
					winScore = bean2.getNum1();
					looseScore = bean1.getNum1();
				} else {
					winner = "비김";
				}
				this.winner = winner;
				this.looser = looser;
				this.winScore = winScore;
				this.LooseScore = looseScore;
	}

/*===== 멤버메소드 =====*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "========\n"
				+this.winner+" : "+this.winScore+"\n"
				+this.looser+" : "+this.LooseScore+"\n"
				+this.winner+" 승리\n"
				+ "========";
	}
}
