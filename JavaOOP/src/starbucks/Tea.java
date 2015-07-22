package starbucks;

public class Tea implements Recipe {
	private String tea;
	@Override
	public void boilWator() {
		// TODO Auto-generated method stub
		System.out.println("물을 끓인다.");
	}

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("티백을 내린다.");
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
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("고객님 ["+this.tea+"] 가 나왔습니다.");
	}

}
