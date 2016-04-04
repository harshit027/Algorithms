package others;

public class SubsetSum {

	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7};
		int sum=14;
		System.out.println(isSubSet(a,a.length,sum));
		
	}
	
	public static boolean isSubSet(int[] a, int n, int sum)
	{
		if(sum==0)
			return true;
		if(n==0 && sum!=0)
			return false;
		
		if(a[n-1]>sum)
			return isSubSet(a,n-1,sum);
		
		return isSubSet(a, n-1, sum-a[n-1]) || isSubSet(a, n-1, sum);
	}
}
