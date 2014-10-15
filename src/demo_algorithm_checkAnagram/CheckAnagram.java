package demo_algorithm_checkAnagram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckAnagram {
	// 用 Logger 类库进行程序的 log 工作
	private final static Logger logger = LoggerFactory.getLogger(CheckAnagram.class);

	public static void main(String args[]) throws Exception {

		String str1 = "abc";
		String str2 = "cba";
		if (StringUtil.areAnagrams(str1, str2)) {
			logger.debug(str1 + " : " + str2 + " are anagrams");
		} else {
			logger.debug(str1 + " : " + str2 + " are not anagrams");
		}

	}
}
