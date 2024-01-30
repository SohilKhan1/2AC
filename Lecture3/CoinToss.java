package Lecture3;

public class CoinToss {
	public static void main(String[] args) {
		int n = 3;
		print(n, "");
	}

	private static void print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		print(n - 1, ans + "H");
		print(n - 1, ans + "T");

	}

}
