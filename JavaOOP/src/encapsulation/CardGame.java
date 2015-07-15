package encapsulation;

public class CardGame {
	// 생성자 단축키
	// CTRL + SPACE
	private String winner; // 멤변 선언.
	public CardGame() {} // 디폴트 생성자

	public CardGame(CardBean bean1, CardBean bean2) {
				
				String winner = "";
				if (bean1.getNum1() > bean2.getNum1()) {
					winner = bean1.getName()+" 승리";
				} else if(bean2.getNum1() < bean2.getNum1()) {
					winner = bean2.getName()+" 승리";
				} else {
					winner = "비김";
				}
				this.winner = winner;
	}
	public String getWinner() {
		return winner;
	}
}
