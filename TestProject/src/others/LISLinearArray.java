package others;

public class LISLinearArray {

	public static void main(String args[])
	{
		int []a={10,22,9,33,21,50,41,60,80};
		System.out.println(LIS(a));
	}
	public static int LIS(int []a)
	{
	
		int max=-1;
		int maxLIS=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxLIS+=1;
			}
		}
		
		return maxLIS;
	}
}
