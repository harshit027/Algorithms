package dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String args[])
	{
		int a[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int [] LIS=new int[a.length];
		for(int i=0;i<a.length;i++)
			LIS[i]=1;
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]>a[j] && LIS[i]<LIS[j]+1)
					LIS[i]=LIS[j]+1;
			}
		}
		int max=-1;
		for(int i=0;i<a.length;i++)
		{
			if(LIS[i]>max)
				max=LIS[i];
		}
				
		System.out.println(max);
	}
}
