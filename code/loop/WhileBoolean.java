package program.code.loop;

public class WhileBoolean{
	
	public static void main(String[]args) {
		
		int u = 0;
		boolean e = true;
		
		while(e) {
			u++;
			System.out.println(u);
			
			  if(u >= 10) {
					e = false;
			}	
		}
	}
}