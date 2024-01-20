package Lecture3;

public class CoinChange {
	static int k = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int amount = 5;
		change(arr, amount, "");
		System.out.println(k);
	}

	private static void change(int[] arr, int amount, String ans) {
		if (amount == 0) {
			if (ans.length() < k) {
				k = ans.length();
			}
			return;
		}

		if (amount < 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			change(arr, amount - arr[i], ans + arr[i]);
		}

	}

}
