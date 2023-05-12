package program.code.loop;

public class ArmstrongNo{
	
	public static void main(String[]args) {
		
		int k = 407;
		int j = 0;
		int x;
		int f = k;
		
		while( f > 0 ) {
			
			x = f % 10;
			j = j + (x*x*x);
			f = f / 10;
		}
		if(k == j) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}