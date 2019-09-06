package minpractice;

import java.util.Random;

public class LottoPractice1 {

	static Random rand = new Random();
	static int[] lotto = new int[6];

	public static void main(String[] args) {

		// 1번 문제 : 로또 배열에 랜덤 숫자를 채우기.(중복)
		createLotto();

		// 2번 문제 : 로또 배열을 출력.(단, 출력결과의 예: 34, 22, 5, 12, 34, 11)
		printLotto();

		// 3번 문제 : 배열에서 [0] 번째 숫자와 [5] 번째 숫자를 교환하기
		changeLotto();

		// 4번 문제 : 로또 배열을 출력.(단, 출력결과의 예: 11, 22, 5, 12, 34, 34)
		printLotto();

	}

	private static void createLotto () {
		for (int i = 0; i < 6; i++)
			lotto[i] = rand.nextInt(45) + 1;

	}

	private static void printLotto() {
		for (int i = 0; i < 6; i++) {
			if(i==5)
			System.out.printf("%d ", lotto[i]);
			else
			System.out.printf("%d, ", lotto[i]);
		}
		System.out.println();

	}

	private static void changeLotto() {
		int j;
		j = lotto[0];
		lotto[0]=lotto[5];
		lotto[5]=j;
	}


}
