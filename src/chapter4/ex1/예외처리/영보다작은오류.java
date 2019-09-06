package chapter4.ex1.예외처리;

public class 영보다작은오류 extends Exception {
	@Override
	public String getMessage() {
	// TODO Auto-generated method stub
		return "영보다 작은 오류";
}
}
