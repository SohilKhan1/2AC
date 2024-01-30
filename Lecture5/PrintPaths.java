package Lecture5;

public class PrintPaths {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println( print(arr, 0, 0, ""));

	}

	private static int print(int[][] arr, int row, int col, String ans) {
		if (col == 2 && row == 2) {
			System.out.println(ans);
			return 1;
		}

		int a = 0;
		int b = 0;
		if (col < arr[0].length - 1)
			a = print(arr, row, col + 1, ans + "H");
		if (row < arr.length - 1)
			b = print(arr, row + 1, col, ans + "V");

		return a + b;
	}
}
