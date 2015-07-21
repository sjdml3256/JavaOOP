package abstraction;

public class BasicBot implements Robot{
	private int energy;
	private int speed;
	@Override
	public void charge(int energy) {
		this.energy += energy;
	}

	@Override
	public void run(int speed) {
		this.speed += speed;
	}

	@Override
	public void status() {
		System.out.println("로봇 속도 : "+ this.speed);
		System.out.println("로봇 에너지 : "+this.energy);
	}
	
}
