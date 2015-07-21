package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * GunRobot
		 * shieldRobot
		 * 
		  출력
		  건로봇은 속도 10, 에너지 10, 공격격 50
		  - 공격력은 인스턴스 변수로 int attackPoint
		  쉴드로봇은 속도 20, 에너지 20, 방어력 50
		  - 방어력은 인스턴스 변수로 int shieldPoint
		 * */
		GunRobot gunbot = new GunRobot();
		gunbot.charge(10);
		gunbot.run(10);

		ShieldRobot shielbot = new ShieldRobot();
		shielbot.charge(20);
		shielbot.run(20);
		
		
		Robot output[] = new Robot[2];
		output[0] = gunbot;
		output[1] = shielbot;
		
		for(Robot robot : output){
			robot.status();
		}
	}
}
