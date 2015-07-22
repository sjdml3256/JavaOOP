package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
	/*
	 * 인터페이스를 구현한 클래스의 객체 생성문법
	 * 인터페이스 인스턴스  = new 생성자();
	 * */	
	Recipe coffe = new Coffe();
	Recipe tea = new Tea();
	coffe.boilWator();
	coffe.brew();
	coffe.pourCup();
	System.out.println("블랙커피 : 1, 설탕커피 : 2");
	Scanner scanner = new Scanner(System.in);
	coffe.select(scanner.nextInt());
	coffe.serve();
	
	tea.boilWator();
	tea.brew();
	tea.pourCup();
	System.out.println("레몬티 : 3, 자몽티 : 4");
	Scanner scanner2 = new Scanner(System.in);
	tea.select(scanner2.nextInt());
	tea.serve();
	}
}
