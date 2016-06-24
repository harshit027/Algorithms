package others;

public class SpiralPrinting {

	public static void main(String args[])
	{
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int k=0,m=a.length,l=0,n=a[0].length;
		while(k<m && l<n)
		{
			for(int i=l;i<n;++i)
			{
				System.out.print(a[k][i]+",");
			}
			k++;
			for(int i=k;i<m;++i)
			{
				System.out.print(a[i][n-1]+",");
			}
			n--;
			
			if(k<m)
			{
				for(int i=n-1;i>=l;--i)
				{
					System.out.print(a[m-1][i]+",");
				}
				m--;
			}
			if(l<n)
			{
				for(int i=m-1;i>=k;--i)
				{
					System.out.print(a[i][l]+",");
				}
				l++;
			}
		}
	}
}
