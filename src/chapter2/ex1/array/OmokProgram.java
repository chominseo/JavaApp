package chapter2.ex1.array;

public class OmokProgram {

	public static void main(String[] args) {

		// ���� 4 : �迭�� �̿��� ���� ���α׷�
		int[] colors = new int[] { 0, 1, 0, 1};

		int[] xs = new int[] { 3, 3, 4, 4 };
		int[] ys = new int[] { 4, 5, 5, 6 };

		char[] board = new char[200];// ���� 0������ ���� ���� ���� ����ߴ�

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				boolean put = false;//put=�߰ߵǾ���.
					//����ã�Ƽ� ����ϱ� ����
				for (int i = 0; i < 4; i++) 
					if (x == xs[i] && y == ys[i]) {//������ġ�� ���� �߰ߵǸ� ����, x���� xs������ i�濡 ��ġ �������� y���� ys������ i�濡 ��ġ �������� 
						if(colors[i]==0)
						System.out.printf("%c", '��');
						else
						System.out.printf("%c", '��');
						put = true;
						break;//�迭���� ���ϴ� ���� ã������ ���̻� ã�� �ʿ䰡 ����.
						}
				if (put != true) {//!=�� ���� �ʴٴ� ǥ��
					if (x == 1 && y == 1)
						System.out.printf("%c", '��');
					else if (x == 10 && y == 1)
						System.out.printf("%c", '��');
					else if (x == 1 && y == 10)
						System.out.printf("%c", '��');
					else if (x == 10 && y == 10)
						System.out.printf("%c", '��');
					else if (y == 1)
						System.out.printf("%c", '��');
					else if (y == 10)
						System.out.printf("%c", '��');
					else if (x == 1)
						System.out.printf("%c", '��');
					else if (x == 10)
						System.out.printf("%c", '��');
					else
						System.out.printf("%c", '��');
					}
				}
			System.out.println();
		}
	}

}

//�������� a1+(n-1)d = �������� 0�϶� al+(n)d
//for(int n=1;n<=5;n++)
//System.out.printf("%d", 1+(n-1)*5) �������� ����

//���α׷����� �����׸��� �տ� �д�
