package dynamicProgramming;

public class CoinChange {

	public static void main(String args[])
	{
		int[] S={1,2,3};
		int sum=10;
		System.out.println(count(S,sum));
	}
	
	public static int count(int [] S, int sum)
	{
		int[][] out= new int[sum+1][S.length];
		for(int i=0;i<S.length;i++)
			out[0][i]=1;
		int includingCoin, excludingCoin;
		
		for(int i=1;i<sum+1;i++)
		{
			for(int j=0;j<S.length;j++)
			{
				if(i>=S[j])
					includingCoin= out[i-S[j]][j];
				else
					includingCoin=0;
				
				if(j>=1)
					excludingCoin=out[i][j-1];
				else
					excludingCoin=0;
				
				out[i][j]=includingCoin+excludingCoin;
					
			}
		}
		
		return out[sum][S.length-1];
		
	}
}
