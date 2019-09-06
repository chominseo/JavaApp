package chapter4.ex3.thread;

public class Program implements Runnable{
	
	public static void download() {
		for(int i=0;i<10;i++)
			System.out.printf("progress : %d%%\n", i+1);
	}

	public static void main(String[] args) {
		
		
		Thread th = new Thread(new Program());
		th.start();
		for(int i=0;i<10;i++)
			System.out.printf("main : %d\n", i+1);
//		download();
		System.out.println("Á¾·á");

	}

	@Override
	public void run() {
		download();
	
	}

}
