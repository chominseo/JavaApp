package chapter4.ex1.예외처리;
//여러용도로 다른곳에서 사용하는 라이브러리
public class Calculator {
	//업무적인 예외 덧셈의 합이 1000을 넘을 수 없다
	public static int add(int x, int y) throws 천을넘는오류 {
		int result=x+y;
		
		if(result>1000)
			throw new 천을넘는오류();
		return result;
	}
	public static int div(int x, int y) throws 영보다작은오류 {
		int result=x/y;
		
		if(result<0)
			throw new 영보다작은오류();
		return result;
	}

}
