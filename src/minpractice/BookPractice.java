package minpractice;

import java.util.Random;
import java.util.Scanner;

public class BookPractice {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) {
		/*
		int a;
		int b;
		
		System.out.print("a�� �Է��ϼ���");
		a = Integer.parseInt(scan.nextLine());
		System.out.print("b�� �Է��ϼ���");
		b = Integer.parseInt(scan.nextLine());
		System.out.printf("a+b�� %d �Դϴ�.",a+b);
		System.out.println();
		int c = 10;
		String number = "10";
		
		System.out.println(c);
		System.out.println(number);
		*/
		/*
		System.out.print("����>");
		int []number=new int[5];
		
		for(int i=0;i<number.length;i++)
			number[i] = scan.nextInt();
		
		for(int i=0;i<number.length;i++)
			System.out.printf("%d\n", number[rand.nextInt(number.length-1)]);
		*/
		
		int[]lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) 
			lotto[i]=rand.nextInt(45)+1;
		
		for(int i=0;i<lotto.length;i++) 
		System.out.println(lotto[i]);
		
		
		
		
		
		
	}

}
