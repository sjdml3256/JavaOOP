package bank;
/*
 * 사용자 입장에서 계좌 관리하는 기능 
 * */
public interface Account {
	public void deposit(int money); // 예금
	public abstract void withDraw(int money); // 출금
	
}
