package chapter2.ex1.array;

public class Testprogram {

	public static void main(String[] args) {

		int[] xs = new int[] { 3, 3, 4, 4 };
		int[] ys = new int[] { 4, 5, 5, 6 };// 배열초기화
		boolean a;
		
		for (int y = 1; y <= 10; y++) 
		{
			for (int x = 1; x <= 10; x++) {
				
				/*
				if (x == xs[0] && y == ys[0])
						System.out.printf("%c", '○');
				if (x == xs[0] && y == ys[0])
						System.out.printf("%c", '●');
				if (x == xs[0] && y == ys[0])
						System.out.printf("%c", '○');
				if (x == xs[0] && y == ys[0])
						System.out.printf("%c", '●');
				 */
				boolean put = false;
				
				for (int i = 0; i < 4; i++) 
					if (x == xs[i] && y == ys[i]){
						System.out.printf("%c", '○');
						put = true;
						break;
						}
				if(!put)
					System.out.printf("%c", '┼');
			}
			System.out.println();
					
			
		}
			
			
				
			
			
	}
}

		/*
		  for (int y = 1; y <= 10; y++) {
		  
		  for (int x = 0; x <= 10; x++)
		  if (x == 3 && y == 4)\
		  System.out.printf("%c",'○');
		  else if(x == 3 && y == 5)
		  System.out.printf("%c", '●');
		  else if(x == 4&& y == 5)
		  System.out.printf("%c", '○');
		  else if(x == 4 && y == 6)
		 System.out.printf("%c", '●');
		 else System.out.printf("%c", '┼');
		 }
		 System.out.println();
		 }
		 
		 
		 
		 
		 for (int y = 0; y < 10; y++) {
		 
		  for (int x = 0; x < 10; x++)
		  System.out.printf("%c", '┼');
		  System.out.println(); }
		  
		  
		  for (int y = 1; y <= 10; y++)
		  {
		  for (int x = 1; x <= 10; x++)
		  {
		  if (x == 3 && y == 4)
		  System.out.printf("%c",'○');
		  else if(x == 3 && y == 5)
		  System.out.printf("%c", '●');
		  else
		 System.out.printf("%c", '┼');
		 }
		 
		 System.out.println(); }
		 */
