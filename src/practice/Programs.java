package practice;

import java.util.Random;
import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
/*
		int a, b, c, d, e;
		a=7;
		b=7;
		c=7;
		d=7;
		e=7;

		int[] a = new int[5];
		for(int i=0; i<5; i++)
			a[i] = 7;
		
		for(int i=0; i<5; i++)
			System.out.println(a[i]);
		
*/
		//랜덤숫자 배열에 넣기
		//랜덤객체를 생성하고, 각각의 
		Random ran = new Random();
		int[] nums = new int[6];
		
		for(int i=0; i<6; i++)
			nums[i] = ran.nextInt(45)+1;
		
		for(int i=0; i<6; i++)
			System.out.println(nums[i]);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}