package Lecture2;

import java.util.*;

public class GenratePar {
	public static void main(String[] args) {
		int n = 3;
		List<String> list = new ArrayList<>();
		print(n, "", 0, 0, list);
		System.out.println(list);
	}

	private static void print(int n, String ans, int open, int close, List<String> list) {
		if (open == n && close == n) {
			list.add(ans);
			//System.out.println(ans);
			return;
		}

		if (open < n)
			print(n, ans + "(", open + 1, close, list);
		if (close < open)
			print(n, ans + ")", open, close + 1, list);

	}
}
