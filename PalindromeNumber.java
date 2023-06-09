package google.interview;


public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber palindrome = new PalindromeNumber();
		int x = 1221;
		System.out.println(palindrome.isPalindrome(x));
	}
	
public boolean isPalindrome(int x) {
        if(x <0) return false;
        
        int reveresed = 0, remainder, original = x;
        
        while( x !=0 ) {
        	remainder = x % 10;
        	reveresed = reveresed * 10 + remainder;
        	x = x/10;
        	
        }
        
        return original == reveresed;
    }
}
