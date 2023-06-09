package google.interview;

import java.util.regex.Pattern;

public class PatternMatch {
	
	public static void main(String[] args) {
		PatternMatch match = new PatternMatch();
		String s = "aa";
		String p = "a*";
		System.out.println(match.isMatch(s, p));
	}
	
public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return s.isEmpty();
        
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        
        if(p.length() >= 2 && p.charAt(1) == '*') {
        	return (isMatch(s, p.substring(2)) || firstMatch && isMatch(s.substring(1), p));
        } else {
        	return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

}
