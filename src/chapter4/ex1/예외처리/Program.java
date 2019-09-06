package chapter4.ex1.예외처리;

public class Program {

	public static void main(String[] args) {
		try {
			int x = Calculator.add(1000, 20);
			x = Calculator.div(20, -1);
			System.out.println("x : " + x);
		}
		catch(영보다작은오류 e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {

			System.out.println("죄송합니다.오류를 드려죄송");
		}

		System.out.println("종료");

	}

}
