package dynamicProgramming;

public class MinimumCostPath {

	public static void main(String args[])
	{
		int[][] cost= { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
		System.out.println(minCost(cost));
	}
	
	public static int minCost(int[][] a)
	{
		int[][] costArray= new int[a.length][a[0].length];
		costArray[0][0]=a[0][0];
		for(int i=1;i<a.length;i++)
		{
			costArray[i][0]=costArray[i-1][0]+a[i][0];
		}
		for(int i=1;i<a[0].length;i++)
		{
			costArray[0][i]=costArray[0][i-1]+a[0][i];
		}
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a[0].length;j++)
			{
				costArray[i][j]=Math.min(Math.min(costArray[i-1][j-1], costArray[i-1][j]), costArray[i][j-1])+a[i][j];
				System.out.print(costArray[i][j]+",");
			}
			System.out.println();
		}
		return costArray[a.length-1][a[0].length-1];
	}
}
