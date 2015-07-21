package inheritance;

public class Iphone extends CelPhone{
	/*필드*/
	private String data;
	private String os;
	//값을 넣고 변수(값을 바꿀수있는)로 쓰고 싶지 않으면(상수..값을 바꿀수 없는)...
	public static boolean TRUE = true; // 오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰";
	// 브랜드를 static 이라는 키워드를 사용해서 클래스변수로 만들고 고정값으로 설정(get/set 만들지 말자.)

	/*생성자*/
	
	/*멤버 메소드*/
	public String getData() {
		return data;
	}
	// get/set 이 되었건 파라미터 추가하는 정도의 변화는
	// 개발자 재량에 있다.
	public void setData(String name, String data) {
		this.data = name + " 에게, 메세지로 "+ data+" 를 전달";
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = "iOS";
	}
	
}
