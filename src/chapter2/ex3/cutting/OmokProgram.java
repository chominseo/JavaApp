package chapter2.ex3.cutting;

public class OmokProgram {
	/*
	private static int findOmok(int x,int y){
		return-1;
			//값을 반환하게 해줌,void 아무것도 없다
	}
	void printOmok(int x,int y) {
		
	}
	*/
	static int[] xs = new int[] { 3, 3, 4, 4 };//객체지향 완전한 어떠한 함수도 클래스안에 없으면 안됨
	static int[] ys = new int[] { 4, 5, 5, 6 };
	static int[] colors = new int[] { 0, 1, 0, 1};

	public static void main(String[] args) {



		char[] board = new char[200];
		
		//Top-Down / Bottom-Up
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				
				//현재위치의 오목돌을 찾아서 출력하는 코드	
				//[현재위치(x,y)의 오목돌]"찾아서"결합"출력"하는 코드
				
				//현재 위치에 오목을 찾다
				int idx = findOmok(x,y);
				
				//현재 위치에 오목을 출력하다
				if(idx!=-1)
				printOmok(idx);
				
				
				
				
				/*
				boolean put = false;
				for (int i = 0; i < 4; i++) 
					if (x == xs[i] && y == ys[i]) {
						if(colors[i]==0)
						System.out.printf("%c", '●');
						else
						System.out.printf("%c", '○');
						put = true;
						break;
						}
						*/
				if (idx==-1) {
					if (x == 1 && y == 1)
						System.out.printf("%c", '┌');
					else if (x == 10 && y == 1)
						System.out.printf("%c", '┐');
					else if (x == 1 && y == 10)
						System.out.printf("%c", '└');
					else if (x == 10 && y == 10)
						System.out.printf("%c", '┘');
					else if (y == 1)
						System.out.printf("%c", '┬');
					else if (y == 10)
						System.out.printf("%c", '┴');
					else if (x == 1)
						System.out.printf("%c", '├');
					else if (x == 10)
						System.out.printf("%c", '┤');
					else
						System.out.printf("%c", '┼');
					}
				}
			System.out.println();
		}
	}
	
	


	private static void printOmok(int idx) {
		// TODO Auto-generated method stub
		if(colors[idx]==1)
			System.out.printf("%c", '○');
		else
			System.out.printf("%c", '●');
	}



	private static int findOmok(int x, int y) {
		
		for (int i = 0; i < 4; i++) 
			if (x == xs[i] && y == ys[i])
				return i;
				
		return -1;

		
	}

}
