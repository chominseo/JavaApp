package chapter3.ex6.oop.inter;

import java.util.Scanner;

//1. 새로운 클래스에서 구현
//2. 기존 클래스 중에서 아무거나에다가 구현
//3. 기존 클래스 중에서 아무거나에 중첩해서 구현
//4. 본체가 생성되는 메소드에 내에서 구현
//5. 본체가 생성되는 메소드에서 익명클래스로 구현*대부분
//6. 람다식 표현으로 구현 *(JDK 8 이상)

public class Program {

	public static void main(String[] args) {
		/*
		class AA implements PrintListener{
			
			@Override
			public void onPrint() {
				System.out.println("나나나");
				}
				
		}
		
		
	    TestConsole console = new TestConsole();
	    console.setListener(new AA());
		console.print();
		
		//익명클래스
		TestConsole console = new TestConsole();
	    console.setListener(new PrintListener() {
			
			@Override
			public void onPrint() {
				System.out.println("나나나");
				
			}
		});
		console.print();
		 
		//람다식
		TestConsole console = new TestConsole();
	    PrintListener listener = new PrintListener() {
	    	@Override
			public void onPrint() {
				System.out.println("나나나");
				
			}
	    };
		
		
		
		TestConsole console = new TestConsole();
	    PrintListener listener =()->{
	    	System.out.println("나나나");
	    };
		*/
		TestConsole console = new TestConsole();
		
	    console.setListener(()->{
	    	System.out.println("sksksk");
	    });
	    
		console.print();
		
		
		
		}
}
