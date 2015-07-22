package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		AngelCoffe kim = new AngelCoffe();
//		System.out.println("블랙커피 : 1, 설탕커피 : 2");
//		kim.prepare(scanner.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("레몬티 : 3, 자몽티 : 4");
		lee.prepare(scanner.nextInt());
	}
}
