package chapter2.ex3.cutting;

public class OmokProgram {
	/*
	private static int findOmok(int x,int y){
		return-1;
			//���� ��ȯ�ϰ� ����,void �ƹ��͵� ����
	}
	void printOmok(int x,int y) {
		
	}
	*/
	static int[] xs = new int[] { 3, 3, 4, 4 };//��ü���� ������ ��� �Լ��� Ŭ�����ȿ� ������ �ȵ�
	static int[] ys = new int[] { 4, 5, 5, 6 };
	static int[] colors = new int[] { 0, 1, 0, 1};

	public static void main(String[] args) {



		char[] board = new char[200];
		
		//Top-Down / Bottom-Up
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				
				//������ġ�� ������ ã�Ƽ� ����ϴ� �ڵ�	
				//[������ġ(x,y)�� ����]"ã�Ƽ�"����"���"�ϴ� �ڵ�
				
				//���� ��ġ�� ������ ã��
				int idx = findOmok(x,y);
				
				//���� ��ġ�� ������ ����ϴ�
				if(idx!=-1)
				printOmok(idx);
				
				
				
				
				/*
				boolean put = false;
				for (int i = 0; i < 4; i++) 
					if (x == xs[i] && y == ys[i]) {
						if(colors[i]==0)
						System.out.printf("%c", '��');
						else
						System.out.printf("%c", '��');
						put = true;
						break;
						}
						*/
				if (idx==-1) {
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
	
	


	private static void printOmok(int idx) {
		// TODO Auto-generated method stub
		if(colors[idx]==1)
			System.out.printf("%c", '��');
		else
			System.out.printf("%c", '��');
	}



	private static int findOmok(int x, int y) {
		
		for (int i = 0; i < 4; i++) 
			if (x == xs[i] && y == ys[i])
				return i;
				
		return -1;

		
	}

}
