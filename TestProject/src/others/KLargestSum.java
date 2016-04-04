package others;
import java.util.ArrayList;
import java.util.Arrays;


public class KLargestSum {
public static int largestSum(int[] a , int k)
{
	int sum =0;
	Arrays.sort(a);
	
	for(int i=0;i<k;i++)
	sum+=a[(a.length-1)-i];
	
	return sum;
}
public static void main(String args[])
{
	int a[]={4,2,3,1,5,6};
	System.out.println(largestSum(a,2));
}
}
