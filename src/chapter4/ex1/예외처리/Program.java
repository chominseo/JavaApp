package chapter4.ex1.����ó��;

public class Program {

	public static void main(String[] args) {
		try {
			int x = Calculator.add(1000, 20);
			x = Calculator.div(20, -1);
			System.out.println("x : " + x);
		}
		catch(�������������� e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {

			System.out.println("�˼��մϴ�.������ ����˼�");
		}

		System.out.println("����");

	}

}
