package others;

public class CoinChange {

	public static void main(String args[])
	{
		int[] S={1,2,3};
		int sum=5;
		System.out.println(count(S,S.length,sum));
	}
	
	public static int count(int [] S, int noOfCoins, int sum)
	{
		if(sum==0)
		return 1;
		
		if(sum < 0)
			return 0;
		
		if(sum >0 && noOfCoins<=0)
			return 0;
		
		return count(S, noOfCoins-1, sum) + count(S, noOfCoins, sum-S[noOfCoins-1]);
	}
}
