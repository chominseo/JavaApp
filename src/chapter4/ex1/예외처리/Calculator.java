package chapter4.ex1.����ó��;
//�����뵵�� �ٸ������� ����ϴ� ���̺귯��
public class Calculator {
	//�������� ���� ������ ���� 1000�� ���� �� ����
	public static int add(int x, int y) throws õ���Ѵ¿��� {
		int result=x+y;
		
		if(result>1000)
			throw new õ���Ѵ¿���();
		return result;
	}
	public static int div(int x, int y) throws �������������� {
		int result=x/y;
		
		if(result<0)
			throw new ��������������();
		return result;
	}

}
