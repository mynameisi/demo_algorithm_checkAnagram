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
	 * 这个方法判断两个字符串是否彼此是 Anagram</br>
	 * 即：两个字符串是否包含有相同数量的相同内容的字符</br>
	 * 比如 abbc 和 bcab 就彼此是 anagram 因为 都有1个a,2个b, 1个c</br>
	 * 算法思路很简单：先把两个字符串都排序，排序后如果两个字符串一样就是anagram，否则不是</br>
	 * 比如：abbc 和 bcab 经过排序后都是 abbc 表示两者彼此是anagram
	 * 而： abbc 和 bcca 经过排序，一个是 abbc，另一个是 abcc, 表示两者彼此不是anagram
	 * 
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areAnagramsSorting(String str1, String str2) {
		//TODO:这里可以加一段代码优化一下么?
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newStr1 = new String(arr1);
		String newStr2 = new String(arr2);
		return newStr1.equals(newStr2);
	}
	
}
