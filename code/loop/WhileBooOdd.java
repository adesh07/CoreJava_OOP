package program.code.loop;

public class WhileBooOdd {

	public static void main(String[]args) {
		
		int g = 101;
		boolean x = true;
		
		while (x) {
			System.out.println(g);
			g--;
			if(g <= 0) {
				x = false;
			}
		}
	}
}
