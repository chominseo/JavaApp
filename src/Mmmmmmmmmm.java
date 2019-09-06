import java.io.IOException;

public class Mmmmmmmmmm {

	public static void main(String[] args) throws IOException {
		
		int [] xs = new int [] {3,5,6,8};
		int [] ys = new int [] {4,8,7,5};
		int [] color = new int [] {2,3,4,5};
		
		
		while(true) {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 20; x++) {
				
				boolean put = false;
				for(int n = 0;n<4;n++)
					if(x==xs[n] && y==ys[n]) {
					if(color[n]%2==0)
					System.out.printf("%c", '¡Ù');
					else
					System.out.printf("%c", '¡Ú');
					}
				/*
				if (x == 3 && y == 4)
					System.out.printf("%c", '¡Ù');
				else if (x == 5 && y == 8)
					System.out.printf("%c", '¡Ú');
				else if (x == 6 && y == 7)
					System.out.printf("%c", '¡Ù');
				else if (x == 8 && y == 5)
					System.out.printf("%c", '¡Ú');
				*/
				if (x == 0 && y == 0) 
					System.out.printf("%c", '¦£');
				else if (x == 19 && y == 0)
					System.out.printf("%c", '¦¤');
				else if (x == 0 && y == 9)
					System.out.printf("%c", '¦¦');
				else if (x == 19 && y == 9)
					System.out.printf("%c", '¦¥');
				else if (x == 0)
					System.out.printf("%c", '¦§');
				else if (y == 9)
					System.out.printf("%c", '¦ª');
				else if (y == 0)
					System.out.printf("%c", '¦¨');
				else if (x == 19)
					System.out.printf("%c", '¦©');
				else
					System.out.printf("%c", '¦«');
			}
			
		System.out.println();
	}
	}

}
