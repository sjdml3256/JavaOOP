package starbucks;

public class Coffe implements Recipe{
	private String coffe;
	@Override
	public void boilWator() {
		// TODO Auto-generated method stub
		System.out.println("물을 끓인다.");
	}

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("커피를 내린다.");
	}

	@Override
	public void pourCup() {
		// TODO Auto-generated method stub
		System.out.println("물을 붓는다.");
	}

	@Override
	public void select(int option) {
		// TODO Auto-generated method stub
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
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("고객님 ["+this.coffe+"] 커피가 나왔습니다.");
	}

}
