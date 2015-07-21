package abstraction;

public class ShieldRobot extends BasicBot{
	private int shieldPoint = 50;
	
	public void setShieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		super.status();
		System.out.println("방어력 : "+ this.shieldPoint);
	}
}
