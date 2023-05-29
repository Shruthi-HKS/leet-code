package google.interview;

public class NumberInZigZagPattern {
	
	public static void main(String[] args) {
		NumberInZigZagPattern zigzag = new NumberInZigZagPattern();
		String s = "PAYPALISHIRING";
		int numRows = 4;
		System.out.println(zigzag.convert(s, numRows));
	}
	
	public String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		StringBuilder builder = new StringBuilder();
		int n = s.length();
		int charsInSection = 2 *(numRows - 1);
		
		for(int currRow=0; currRow < numRows; ++currRow) {
			int index = currRow;
			
			while(index < n) {
				builder.append(s.charAt(index));
				
				if(currRow !=0 && currRow != (numRows -1)) {
					int charsInBetween = charsInSection - 2 * currRow;
					int secondIndex = index + charsInBetween;
					if(secondIndex < n) {
						builder.append(s.charAt(secondIndex));
					}
				}
				index += charsInSection;
			}
		}
		
		return builder.toString();
	}

}
