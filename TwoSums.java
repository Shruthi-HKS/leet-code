package google.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSums {
	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		TwoSums sum = new TwoSums();
		int[] result = sum.twoSums(nums, target);
		IntStream.of(result).forEach(num -> System.out.println(num));
	}
	
	public int[] twoSums(int[] nums, int target) {
		Map<Integer, Integer> sumNumbers = new HashMap<Integer,Integer>();
		for(int i=0; i < nums.length ; i++) {
			int sum = target - nums[i];
			if(sumNumbers.containsKey(sum)) {
				return new int[] {sumNumbers.get(sum),i};
			}
			sumNumbers.put(nums[i],i);
		}
		
		return new int[] {-1,-1};
	}
	

}
