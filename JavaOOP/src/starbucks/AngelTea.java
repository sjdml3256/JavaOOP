package starbucks;
/*
 * extends 는 CTRL + SPACE 로 @Override를 호출하는데
 * 그것은 extends 클래스가 일반클래스인 경우이고
 * 추상클래스는 일반클래스 + 인터페이스 형태이므로
 * 인터페이스의 특징을 갖게 된다.
 * 따라서 extends 이지만 부모클래스가 추상클래스라면
 * unimplements 를 해줘야 한다.
 * */
public class AngelTea extends DrinkRecipe{
	private String tea;
	
	@Override
	void brew() {
		System.out.println("티백을 내린다.");
	}

	@Override
	void select(int option) {
		switch (option) {
		case 3:
			this.tea = "레몬티";
			break;
		
		case 4:
			this.tea = "자몽티";
			break;

		default:
			this.tea = "선택오류";
			break;
		}
		
	}

	@Override
	void serve() {
		System.out.println("고객님 ["+this.tea+"] 가 나왔습니다.");
		
	}
	
}
