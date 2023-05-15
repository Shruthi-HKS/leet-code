package google.interview;

public class MedianSortedArrays {
	public static void main(String[] args) {
		MedianSortedArrays sort = new MedianSortedArrays();
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(sort.findMedianSortedArrays(nums1, nums2));
	}
	
public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        
	final boolean isNums1Even = nums1.length %2 ==0;
	final boolean isNums2Even = nums2.length % 2 ==0;
	final boolean isEven = isNums1Even == isNums2Even;
	final int medianLength = (nums1.length/2) + (nums2.length /2) +1;
	
	int prevValue = Integer.MIN_VALUE;
	int thisValue = Integer.MIN_VALUE;
	int index = 0;
	int i=0;
	int j = 0;
	
	while(index++ < medianLength) {
		prevValue = thisValue;
		
		if(i < nums1.length && j < nums2.length) {
			
			thisValue = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
			
		} else if(i < nums1.length) {
			thisValue = nums1[i++];
		} else {
			thisValue = nums2[j++];
		}
	}
	
	return isEven ? (prevValue/2.0d)+(thisValue/2.0d) : thisValue;
	
    }

}
