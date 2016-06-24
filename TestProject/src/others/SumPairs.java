package others;

public class SumPairs {

	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,7,8};
		int sum=6;
		int l=0,r=a.length-1;
		while(l<r)
		{
			if(a[l]+a[r]<sum)
				l++;
			else
				if(a[l]+a[r]>sum)
					r--;
			if(a[l]+a[r]==sum)
			{
				System.out.println(a[l]+","+a[r]);
				l++;r--;
			}
		}
	}
}
