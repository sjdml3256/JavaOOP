package abstraction;

public class TV extends ProductSpec{
	// 주어진 것만 하라고 했으면 ProductSpec 에서 마무리 됬을 것
	// 그런데 추가정보를 더하라고 했으면 상속
	private String screenSize;
	private String screenType;
	
	
	public void writeInfo(String company, String name, String seriaNo,
						String screenSize, String screenType) {
		super.writeInfo(company, name, seriaNo);
		// 부모에게 선언된 public 메소드에 접근, 사용가능
		// super 라는 키워드를 통해서...
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("스크린 사이즈 : "+ this.screenSize);
		System.out.println("스크린 타입 : "+this.screenType);
	}
}
