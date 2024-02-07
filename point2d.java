import java.util.Scanner;

public class point2D {

		private int x, y;
		
		point2D (int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public int getx(){
			return x;
		}
		public int gety() {
			return y;
		}
		
	public static void main(String[] args) {
			Scanner ponto2d = new Scanner(System.in);
			
			System.out.println("Enter the value of x: ");
			int x = ponto2d.nextInt();
			
			System.out.println("Enter the value of y");
			int y = ponto2d.nextInt();
			
			point2D point2d = new point2D(x,y);
			
			System.out.println("The value of x is: " + point2d.getx());
			System.out.println("The value of y is: " + point2d.gety());
	}
}
