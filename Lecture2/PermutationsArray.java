package Lecture2;
//package Lecture1;
//
//import java.util.*;
//
//public class PermutationsArray {
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3 };
//		ArrayList<Integer> list = new ArrayList<>();
//		List<ArrayList<Integer>> ans = new ArrayList<>();
//		print(arr, list , ans);
//		System.out.println(ans);
//	}
//
//	private static void print(int[] arr, ArrayList<Integer> list, List<ArrayList<Integer>> ans) {
//
//		if (list.size() == 3) {
//			System.out.println(list);
//			ans.add(new ArrayList<>(list));
//			return;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 42) {
//				continue;
//			}
//			list.add(arr[i]);
//			int k = arr[i];
//			arr[i] = '*';
//			print(arr, list,ans);
//			arr[i] = k;
//			list.remove(list.size() - 1);
//		}
//
//	}
//
//}
