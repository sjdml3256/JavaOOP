package abstraction;

public class GunRobot extends BasicBot{
	private int attackPoint = 50;
	
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		super.status();
		System.out.println("공격력 : "+this.attackPoint);
	}
}
