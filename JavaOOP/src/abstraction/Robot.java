package abstraction;

public interface Robot {
	/*
	 * 로봇이 충전하는 기능
	 * */
	public void charge(int energy); // 충전
	
	/*
	 * 로봇이 움직이는 기능
	 * */
	public void run(int speed); // 움직임
	
	/*
	 * 로봇의 상태 모니터링
	 * */
	public void status();
}
