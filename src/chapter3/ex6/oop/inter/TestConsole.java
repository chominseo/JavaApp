package chapter3.ex6.oop.inter;

public class TestConsole {
	
	private PrintListener listener;
	
	public void input() {
		
	}
	public void print() {
		System.out.println("1");
		System.out.println("2");
		//System.out.println("3");
		
		listener.onPrint();
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
	}
	public void setListener(PrintListener listener) {
		this.listener = listener;
	}

}
