package Lecture3;

public class Subseq {
	public static void main(String[] args) {
		String s = "abc";
		print(s, "");
	}

	private static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		print(s.substring(1), ans + s.charAt(0));
		print(s.substring(1), ans);

	}

}
