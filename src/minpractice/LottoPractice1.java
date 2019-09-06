package minpractice;

import java.util.Random;

public class LottoPractice1 {

	static Random rand = new Random();
	static int[] lotto = new int[6];

	public static void main(String[] args) {

		// 1�� ���� : �ζ� �迭�� ���� ���ڸ� ä���.(�ߺ�)
		createLotto();

		// 2�� ���� : �ζ� �迭�� ���.(��, ��°���� ��: 34, 22, 5, 12, 34, 11)
		printLotto();

		// 3�� ���� : �迭���� [0] ��° ���ڿ� [5] ��° ���ڸ� ��ȯ�ϱ�
		changeLotto();

		// 4�� ���� : �ζ� �迭�� ���.(��, ��°���� ��: 11, 22, 5, 12, 34, 34)
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
