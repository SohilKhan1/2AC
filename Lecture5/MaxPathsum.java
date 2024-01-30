package Lecture5;

public class MaxPathsum {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(print(arr, 0, 0, ""));

	}

	private static int print(int[][] arr, int row, int col, String ans) {
		if (col == 2 && row == 2) {
			System.out.println(ans);
			return 1;
		}

		int a = 0;
		int b = 0;
		if (col < arr[0].length - 1)
			a = print(arr, row, col + 1, ans + arr[row][col]);
		if (row < arr.length - 1)
			b = print(arr, row + 1, col, ans + arr[row][col]);

		return a + b;
	}
}
