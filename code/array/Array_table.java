package Java.core.array;

public class Array_table {

	public static void main(String[] args) {

		int[][] pahadha = new int[11][11];

		for (int x = 1; x < pahadha.length; x++) {

			for (int y = 1; y < pahadha.length; y++) {

				pahadha[x][y] = x * y;

			}
		}

		for (int[] gg : pahadha) {

			for (int n1 : gg) {

				System.out.print(n1 + "\t");
			}
			System.out.println();
		}
	}
}