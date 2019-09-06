package minpractice;

import java.util.Random;
import java.util.Scanner;

public class Min_practice_random {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			boolean ex = false;
			int temp = rand.nextInt(45) + 1;

			for (int j = 0; j < i; j++)
				if (temp == lotto[j]) {
					ex = true;
					break;

				}
			if (!ex)
				lotto[i] = temp;

			System.out.printf("%d ",lotto[i]);
		}
	}

}
