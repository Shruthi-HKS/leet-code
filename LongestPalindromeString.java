package google.interview;

//two pointer approach
public class LongestPalindromeString {
	
	public static void main(String[] args) {
		LongestPalindromeString str = new LongestPalindromeString();
		System.out.println(str.longestPalindrome("cbbd"));
	}
	
public String longestPalindrome(String s) {
    int n = s.length();    
	if(n == 0) return "";
	if(n == 1) return s;
	int minStart = 0, maxLen = 0;
	
	for(int i=0 ; i < n;) {
		
		/*Check if the remaining length from i to the end of the string is less than half of the maxlen. If it is, there is no possibility of finding a longer palindrome, so we break out of the loop.*/
		if(n-i < maxLen/2) {
			break;
		}
		int l = i,  r = i;
		
		// Find the center of the palindrome
		while(r < n-1 && s.charAt(r) == s.charAt(r+1)) r++;
		
		//update the next starting point
		i = r+1;
		
		// Expand around the center to find the longest palindrome
		while(l >0 && r < n-1 && s.charAt(l-1) == s.charAt(r+1)) {
			l--;
			r++;
		}
		int  newLen = r - l +1;
		
		if(newLen > maxLen) {
			maxLen = newLen;
			minStart = l;
			
		}
	}
	
	return s.substring(minStart, minStart + maxLen);
    }

}
