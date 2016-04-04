package dynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String args[])
	{
		char [] a={'A','G','G','T','A','B'};
		char[] b={'G','X','T','X','A','Y','B'};
		System.out.println(LCS(a,b));
	}
	
	public static int LCS(char []a, char []b)
	{
		int [][]LCS=new int [a.length+1][b.length+1];
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<=b.length;j++)
			{
				if(i==0 || j==0)
					LCS[i][j]=0;
				else if(a[i-1]==b[j-1])
					LCS[i][j]=LCS[i-1][j-1]+1;
				else
					LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1]);
				System.out.print(LCS[i][j]+",");
			}
			System.out.println();
		}
		
		return LCS[a.length][b.length];
	}
}
