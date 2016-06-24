package others;

public class MaximumSubarraySum {

	public static void main(String args[])
	{
		MaximumSubarraySum obj= new MaximumSubarraySum();
		int [] array={-2,3,-1,4,-6,8};
		System.out.println(maxSubArray(array));
	}
	static int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}
}
