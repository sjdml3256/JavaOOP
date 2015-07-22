package starbucks;
/*
 @ Date : 2015.07.22
 @ Author : me
 @ Story : 추상클래스 학습
 * */
public interface Recipe {
	/*
	 * 커피 끓이는 순서
	 * 1. 물을 끓인다.
	 * 2. 커피를 내린다.
	 * 3. 물을 컵에 붓는다.
	 * 4. 설탕 첨가 여부를 확인한다.
	 * 		- 무설탕 : 블랙, 설탕 : 밀크
	 * 5. 커피를 제공한다.
	 * 		- 고객님 [ ] 커피가 나왔습니다.
	 * */
	
	public abstract void boilWator();
	/*
	 * 인터페이스는 무조건 추상 메소드가 와야 하기 때문에
	 * abstract 가 생략 되어도 디폴트로 있는것으로 간주하고
	 * 에러를 발생시키지 않는다.
	 * */
	public void brew();
	public void pourCup();
	public void select(int option);
	public void serve();
	
	/*
	 * 홍차(Tea) 끓이는 순서
	 * 1. 물을 끓인다.
	 * 2. 티백을 내린다.
	 * 3. 물을 컵에 붓는다.
	 * 4. 레몬, 자몽 첨가 여부를 확인한다.
	 * 		- 레몬 : 레몬티, 설탕 : 자몽티
	 * 5. 홍차를 제공한다.
	 * 		- 고객님 [ ]티 가 나왔습니다.
	 * */
}
