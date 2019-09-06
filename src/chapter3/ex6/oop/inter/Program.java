package chapter3.ex6.oop.inter;

import java.util.Scanner;

//1. ���ο� Ŭ�������� ����
//2. ���� Ŭ���� �߿��� �ƹ��ų����ٰ� ����
//3. ���� Ŭ���� �߿��� �ƹ��ų��� ��ø�ؼ� ����
//4. ��ü�� �����Ǵ� �޼ҵ忡 ������ ����
//5. ��ü�� �����Ǵ� �޼ҵ忡�� �͸�Ŭ������ ����*��κ�
//6. ���ٽ� ǥ������ ���� *(JDK 8 �̻�)

public class Program {

	public static void main(String[] args) {
		/*
		class AA implements PrintListener{
			
			@Override
			public void onPrint() {
				System.out.println("������");
				}
				
		}
		
		
	    TestConsole console = new TestConsole();
	    console.setListener(new AA());
		console.print();
		
		//�͸�Ŭ����
		TestConsole console = new TestConsole();
	    console.setListener(new PrintListener() {
			
			@Override
			public void onPrint() {
				System.out.println("������");
				
			}
		});
		console.print();
		 
		//���ٽ�
		TestConsole console = new TestConsole();
	    PrintListener listener = new PrintListener() {
	    	@Override
			public void onPrint() {
				System.out.println("������");
				
			}
	    };
		
		
		
		TestConsole console = new TestConsole();
	    PrintListener listener =()->{
	    	System.out.println("������");
	    };
		*/
		TestConsole console = new TestConsole();
		
	    console.setListener(()->{
	    	System.out.println("sksksk");
	    });
	    
		console.print();
		
		
		
		}
}
