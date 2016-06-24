package crackingTheCoding;

public class ChangeReturnDP {

	public static void main(String args[])
	{
		int[] coins={1,2,3};
		int n=10;
		int[][] table= new int[n+1][coins.length];
		int x=0,y=0;
		for(int i=0;i<coins.length;i++)
			table[0][i]=1;
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(i>=coins[j])
					x=table[i-coins[j]][j];
				else
					x=0;
				
				if(j>=1)
					y=table[i][j-1];
				else
					y=0;
				
				table[i][j]=x+y;
			}
		}
		System.out.println(table[n][coins.length-1]);	
	}
}
