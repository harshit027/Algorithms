package others;

public class RotateMatrix {

	public static void main(String args[])
	{
		int [][]in={{1,2},{3,4},{5,6}};
		print(in);
		print(rotate(in));
	}
	
	public static void print(int[][] in)
	{
		for(int i=0;i<in.length;i++)
		{
			for(int j=0;j<in[0].length;j++)
			{
				System.out.print(in[i][j]+",");
			}
			System.out.println();
		}
	}
	public static int [][] rotate(int [][] in)
	{
		int c=in[0].length;
		int r=in.length;
		int [][] out=new int[in[0].length][in.length];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				out[j][r-i-1]=in[i][j];
			}
		}
		return out;
	}
}
