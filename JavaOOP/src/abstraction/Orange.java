package abstraction;

public class Orange implements FruitsInterface{
	public void display(String str){
		System.out.println(str+" 오렌지 입니다.");
	}
	public int count() { // int는 리턴 타입
						// 리턴 타입이 void 가 아니라면 반드시 return 키워드를 사용해야한다.
						// 리턴 타입이 존재 할때 코딩하는 방법
						// 1. 리턴 타입의 지변을 초기화 한다.
		int count = 100;
						// 2. return 키워드 뒤에 지변을 둔다
		return count;
		
	}
}
