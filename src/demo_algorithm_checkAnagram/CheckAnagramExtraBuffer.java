package demo_algorithm_checkAnagram;


public class CheckAnagramExtraBuffer {
	

	public static void main(String args[]) throws Exception {

		String str1 = "abc";
		String str2 = "cbd";
		if (CheckAnagramExtraBuffer.areAnagrams(str1, str2)) {
			System.out.println(str1 + " : " + str2 + "彼此是 anagrams");
		} else {
			System.out.println(str1 + " : " + str2 + "彼此不是 anagrams");
		}

	}

	/**
	 * 这个方法判断两个字符串是否彼此是 Anagram</br>
	 * 即：两个字符串是否包含有相同数量的相同内容的字符</br>
	 * 比如 abbc 和 bcab 就彼此是 anagram 因为 都有1个a,2个b, 1个c</br>
	 * 该算法假设待定字符串中的所有字符都来自于ASCII码表，即只有256中可能</br>
	 * 它用一个256位长度的数组充当记录表</br>
	 * 先过一遍第一个字符串，记录每一个字母都出现了几次</br>
	 * 比如：第一个字符串是 abbc，则在a的位置记录1，b：2，c:1</br>
	 * 再过一遍第二个字符串，在相应字母的位置-1</br>
	 * 比如：第二个字符串是 bcab，则:</br>
	 * b的位置-1得到：b:1</br>
	 * c的位置-1得到：c:0</br>
	 * a的位置-1得到：a:0</br>
	 * b的位置-1得到：b:0</br>
	 * 最后过一遍记录表，如果全都是0，表示两个字符串是anagram</br>
	 * 如果有非0出现，表示两个字符串不是anagram
	 * 
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean areAnagrams(String str1, String str2) {
		//TODO:在这里可以加一段代码优化以下么？
		
		int[] letters = new int[256];	//声明一个记录表功能的数组，长度为256个，每个位置对应ASCII码表中的一个字母	
		//TODO:能不能用一个占用空间更小，速度更快的记录表？提示：要用到位移操作
		
		for (char c : str1.toCharArray()) { 
			letters[c]++;//不管记录还是没记录过，都在C的位置加一次出现频率的记录
		}
		for(char c : str2.toCharArray()){
			--letters[c];
		}
		for(int i: letters){
			if(i!=0){
				return false;
			}
		}
		return true;//如果记录数组全都是0，表示两个字符串彼此是anagram，返回true
	}
}
