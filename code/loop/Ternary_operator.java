package program.code.loop;

public class Ternary_operator {

	public static void main(String[] args) {

		int a = 20;
		int b = 50;

		int c = (a < b) ? 27 : 81;
		System.out.println(c);

		int d = (a > b) ? 91 : ((a < b) ? 60 : 43);
		System.out.println(d);
	}
}
