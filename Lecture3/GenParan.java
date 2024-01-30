package Lecture3;

import java.util.*;

public class GenParan {
	public static void main(String[] args) {
		int n = 3;
		List<String> list = new ArrayList<>();
		print(n, 0, 0, "", list);
		System.out.println(list);
	}

	private static void print(int n, int open, int close, String ans, List<String> list) {
		if (open == n && close == n) {
			list.add(ans);
			return;
		}
		if(open<n){
			print(n, open+1, close, ans+"(", list);
		}
		if(close<open) {
			print(n, open, close+1, ans+")", list);
		}

	}

}
