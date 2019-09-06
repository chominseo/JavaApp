package minpractice;

public class Ssddf {
	public static void main(String[] args) {
		
		   class Fighter{
			      private int x;
			      private int y;
			      private Missile[] missles;

			      public void move(int x, int y){
			          this.x = x;
			          this.y = y;
			          invalidate();         
			      }

			      public void fire(){
			          // 생략
			          missile.move();
			      }
			   }

			   class Enemy{
			      private int x;
			      private int y;
			      private Bullet[] bullets;

			      public void move(int x, int y){
			          this.x = x;
			          this.y = y;
			          invalidate();         
			      }

			      public void fire(){
			          // 생략
			          bullet.move();
			      }
			   }
		
	}

}
