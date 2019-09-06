package chapter2.ex3.cutting;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		//로또 프로그램
		//1.준비물(변수)
		Random rand = new Random();
		
		//2.초기화(번호를 초기화)
		for(int i = 0;i<6;i++) {
			int x = rand.nextInt(45)+1;
					
					System.out.printf("%d ",x);
		}
		
		//3.입력
		
		
		//4.출력

	}

}
