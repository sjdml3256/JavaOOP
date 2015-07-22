package starbucks;
/*
 * 	추상 클래스
 *	  - 추상 메소드를 가지고 있는것은 인터페이스와 동일하나,
 *		구상메소드({}를 가지고 있은것)도 추가로 가질수 있고
 * 		객체 생성시 개발자 마음 대로 메소드를 추가하여도 문제가 없다.
 * */
public abstract class DrinkRecipe {
	
	public void prepare(int option) {
		boilWator();
		brew();
		pourCup();
		select(option);
		serve();
	}
	private void boilWator(){
		System.out.println("물을 끓인다.");
	}
	abstract void brew();
	// 추상메소드는 private 은 허용되지 않는다.
	// 외부에서 접근 금지를 하려면 디폴트 상태(public, private 가 없는 상태)로
	// 만든다.
	
	public void pourCup() {
		System.out.println("물을 겁에 붓는다.");
	}
	abstract void select(int option);
	abstract void serve();
	
}
