package google.interview;


public class myAtoi {
	
	public static void main(String[] args) {
		myAtoi atoi = new myAtoi();
		System.out.println(atoi.myAtoiString("4193 with words"));
	}
	
	public int myAtoiString(String s) {
		int len = s.length();
		if(len == 0) {
			return 0;
		}
		double num =0; int i =0;
		while(i < len && s.charAt(i) == ' ') {
			i++;
		}
		boolean positive = s.charAt(i) == '+';
		boolean negative = s.charAt(i) == '-';
		
		if(positive) {
			i++;
		}
		if(negative) {
			i++;
		}
		
		while(i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
			num = num * 10 + (s.charAt(i) - '0');
			i++;
		}
		num = negative ? -num : num;
		num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;
		num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
		return (int) num;
	}

}
