package bank;

public class Bank implements BankRole{
	// 필드
	// 은행은 통장을 여러개를 관리한다.
	// 따라서 필드에 인스턴스 변수 하나를 지정하지 않고
	// 여러개를 담을 수 있는 배열을 지정한다.
	
	// 아래 배열은 은행에서 보면 계좌를 관리하는 DB
	private BankBook[] bankBookList;
	private int count;
	
	// 배열, 자료구조(컬렉션) 을 보유하는
	// 객체를 만들고자 할 때는 그 객체의
	// 생성자에 배열, 자료구조의 객체 생성해준다.
	public Bank(int count){
		bankBookList = new BankBook[count];
	}
	
	
	public BankBook[] getBankBookList() {
		return bankBookList;
	}


	public int getCount() {
		return count;
	}


	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}


	public void setCount(int count) {
		this.count = count;
	}


	// 계좌 계설
	/*
	 * (설정) 계좌번호, 계좌주, 비번, 잔액만 입력하면 통장을 만들어준다
	 * */
	@Override
	public void openAccount(String ownerName,
			int password, int restMoney) {
		
		BankBook bankBook = new BankBook(ownerName);
		
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		bankBookList[count] = (BankBook) bankBook; // 통장을 개설 하자마자 은행 전산DB에 통장정보 저장 개념
		this.count ++; // 전체 은행에 개설된 통장 갯수 1 증가.
		System.out.println(bankBook.showAccount());
	}

	// 계좌 검색 (계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;

		// String -> int
		int searchAccountNo = Integer.parseInt(accountNo);
		/*
		 * 문자타임(String) 서로 같은지 여부 .equals()
		 * 숫자타임(int) 서로 같은지 여부 ==
		 * */
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo() == searchAccountNo) {
				account = bankBookList[i]; 
			}
		}
		return account;
	}
	
	// 계좌 검색(이름) -> 리턴결과 : 계좌 1개 이상
	@Override
	public BankBook[] searchAccountByName(String ownerName) {
		
		// seachAccountByName() 이 메서드를 호출하면
		// 자동으로 searchCountByName()을 먼저 호출 하라 라는 의미.
		int tempcount = this.searchCountByName(ownerName);
		if (tempcount == 0) { // 조회하는 사람의 통장이 하나도 없다면
			return null;
		}
		// 위처럼 필터링을 하는 이유는 본 알고리즘을 하기 전에
		// 필요없는 상태라면 알고리즘을 호출하지 않기위해서다.
		// 그렇지 않으면 자원(리소스 : 메모리, DB)의 낭비를 초래한다.
		BankBook[] accounts = new BankBook[tempcount];
		tempcount = 0;  // 0 으로 초기화 시켜서 배열의 인덱스로
						// 사용해야함
		for (int i = 0; i < accounts.length; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[tempcount] = bankBookList[i];
				tempcount++;
			}
		}
		return accounts;
	}

	// 계좌 검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		/*
		 * for 문을 돌면서 파라미터로 받은 이름과 동일한 통장(계좌)이 있다면
		 * count 를 0 에서 1 씩 증가 시켜라. 라는 의미.
		 * */
		int count = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++; 
			}
		}
		return count;
	}

	// 계좌 폐지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		// flag는 삭제가 성공적으로 이뤄지면 true 를 리턴하고
		// 삭제 할것이 없으면 false 를 리턴한다.
		boolean closeOk = false;
		// String(문자열) 로 들어온 값을 숫자로 바꿔서 비교
		BankBook bankBook = this.searchAccountByAccountNo(accountNo);
		
		// 필터링에서는 if-else 구문을 사용하지 않고 if 문을 사용한다.
		if (bankBook == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return closeOk;
		}
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo() == searchAccountNo) {
				
			
			/*
			 * j = i 바꾼 이유는
			 * 홍길동의 계좌가 은행 전체 계좌의 50번째 라면
			 * 내부 for 문에서 다시 처음 0 부터 회전하지 않고
			 * 홍길동의 계좌가 있는 인덱스 번호부터 
			 * 뒤에 있는 계좌번호를 덮어 쓰는 방식으로 진행한 후
			 * 맨 마지막 인덱스 번호를 제거 하면
			 * 은행에서 전체 계좌가 100개가 있는 상황이라면
			 * 홍길동이 삭제 된 후 전체 계좌 수는 99개가 될것이다.
			 * 그래서 this.count -1 을 해주었음.  
			 * */
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count--;
				
				// 위 알고리즘을 거친 후에야 계좌 삭제가 일어났다고 본다.
				closeOk = true;
			}
		}
		return closeOk;
	}
}
