package Lecture2;

public class ClimbStairs {
	static int count;

	public static void main(String[] args) {
		int n = 4;
		print(n, "");
		System.out.println(count);
	}

	private static void print(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		if (n < 0) {
			return;
		}

//		int a = print(n - 1, ans + 1);
//		int b = print(n - 2, ans + 2);
//		int c = print(n - 3, ans + 3);
//		return a + b + c;

		for (int i = 1; i <= 3; i++) {
			print(n - i, ans + i);

		}

	}

}
