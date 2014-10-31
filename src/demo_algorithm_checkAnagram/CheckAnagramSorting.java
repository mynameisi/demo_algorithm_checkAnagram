package demo_algorithm_checkAnagram;

import java.util.Arrays;

public class CheckAnagramSorting {
	

	public static void main(String args[]) throws Exception {

		String str1 = "abc";
		String str2 = "cba";
		if (CheckAnagramSorting.areAnagramsSorting(str1, str2)) {
			System.out.println(str1 + " : " + str2 + "彼此是 anagrams");
		} else {
			System.out.println(str1 + " : " + str2 + "彼此不是 anagrams");
		}

	}
	/**
	 * 这个方法判断两个String是否彼此是 Anagram</br>
	 * 思路很简单</br>
	 * 就是看两个字符串经过排序之后是否相同</br>
	 * 相同表示这两个字符串中有完全相同的字符，即互相为anagram
	 * 反之，则互相不为anagram
	 * 
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areAnagramsSorting(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newStr1 = new String(arr1);
		String newStr2 = new String(arr2);
		return newStr1.equals(newStr2);
	}
	
}
