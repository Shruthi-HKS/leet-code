package google.interview;

import java.util.HashSet;
import java.util.Set;

// Longest Substring Without Repeating Characters

public class LongestSubstring {
	
	public static void main(String[] args) {
		LongestSubstring str = new LongestSubstring(); 
		String s = "pwwkew";
		System.out.println(str.lengthOfSubstringWithoutRepeatingCharacter(s));
	}

	public int lengthOfSubstringWithoutRepeatingCharacter(String s) {
		Set<Character> resultSet = new HashSet<>();
		int max=0;
		int left = 0;
		for(int right =0; right < s.length() ; right++) {
			while(!resultSet.add(s.charAt(right))) {
				resultSet.remove(s.charAt(left++));
			}
			max = Math.max(max, right - left +1);
		}
		
		return max;
	}
}
