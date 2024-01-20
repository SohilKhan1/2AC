package Lecture2;

public class Permutations {
	public static void main(String[] args) {
		String s = "abc";
		print(s, "");
	}

	private static void print(String s, String ans) {
		if (ans.length() == 3) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			print(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
		}

	}

}
