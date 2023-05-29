package google.interview;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num = 120;
		ReverseNumber rev = new ReverseNumber();
		System.out.println(rev.reverse(num));
	}
	
	public int reverse(int num) {
		int temp = 0;
		int reverse = 0;
		while(num !=0) {
			temp = num%10;
			reverse = reverse * 10 + temp;
			num = num/10;
			
		}
		if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE) {
			return reverse;
		}
		else {
			return 0;
		}
	}

}
