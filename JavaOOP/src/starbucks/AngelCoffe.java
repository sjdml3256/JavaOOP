package starbucks;

public class AngelCoffe extends DrinkRecipe{
	private String coffe;
	
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1:
			this.coffe = "블랙";
			break;
		
		case 2:
			this.coffe = "밀크";
			break;

		default:
			this.coffe = "선택오류";
			break;
		}
	}

	@Override
	void serve() {
		System.out.println("고객님 ["+this.coffe+"] 커피가 나왔습니다.");
	}
	
}
